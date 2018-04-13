/*
 * Copyright 2010 James Pether Sörling
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *	$Id$
 *  $HeadURL$
*/
package com.hack23.cia.service.external.esv.impl;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.commons.codec.Charsets;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;
import org.junit.Ignore;
import org.junit.Test;

/**
 * The Class EsvGovernmentOperationIncomeReaderTest.
 */
public final class EsvGovernmentOperationIncomeReaderTest extends AbstractEsvFunctionalIntegrationTest {

	@Test
	@Ignore
	public void downloadIncomeCsvZipTest() throws IOException {
		Content returnContent = Request.Get(
				"https://www.esv.se/psidata/manadsutfall/GetFile/?documentType=Inkomst&fileType=Zip&fileName=M%C3%A5nadsutfall%20inkomster%20januari%202006%20-%20februari%202018,%20definitivt.zip&year=2018&month=2&status=Definitiv")
				.execute().returnContent();
		readUsingZipInputStream(returnContent.asStream());

	}

	@Test
	public void readIncomeCsvZipTest() throws IOException {
		readUsingZipInputStream(EsvGovernmentOperationIncomeReaderTest.class.getResourceAsStream("/Månadsutfall inkomster januari 2006 - februari 2018%2c definitivt.zip"));
	}

	private static void readUsingZipInputStream(InputStream inputStream) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(inputStream);
		final ZipInputStream is = new ZipInputStream(bis);

		try {
			ZipEntry entry;
			while ((entry = is.getNextEntry()) != null) {
				readCsvContent(entry, is);
			}
		} finally {
			is.close();
		}

	}

	private static void readCsvContent(final ZipEntry entry, InputStream is) throws IOException {
		CSVParser parser = CSVParser.parse(new InputStreamReader(is,Charsets.UTF_8), CSVFormat.RFC4180.withDelimiter(';'));
		for (CSVRecord csvRecord : parser) {
			System.out.println(csvRecord.toString());
		}
	}

}