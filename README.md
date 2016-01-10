# cia
Citizen Intelligence Agency



Citizen Intelligence Agency Demo https://www.hack23.com/cia/



Project documentation [http://cia.sourceforge.net/](http://cia.sourceforge.net/)

Github source code location [https://github.com/Hack23/cia](https://github.com/Hack23/cia)

Build server, jenkins [https://www.hack23.com/jenkins/](https://www.hack23.com/jenkins/)

QA report, sonarqube [https://www.hack23.com/sonar/](https://www.hack23.com/sonar/)

Repository manager, nexus [https://www.hack23.com/nexus/](https://www.hack23.com/nexus/)




# Installing Debian/Ubuntu package

 Currently only build a debian package, works with debian and ubuntu 14.04,14.10,15.04,15.10.


1. Installing database(postgres) and openjdk

```
$ sudo apt-get install openjdk-8-jdk postgresql pgadmin3
```


2. Installing Oracle JDK 8 on Ubuntu

First you need to add webupd8team Java PPA repository in your system and install Oracle Java 8 using following set of commands.

```
$ sudo add-apt-repository ppa:webupd8team/java
$ sudo apt-get update
$ sudo apt-get install oracle-java8-installer
```

3. Create empty database

```
$ sudo su - postgres
$ psql
postgres=# CREATE USER eris WITH password 'discord';
postgres=# CREATE DATABASE cia_dev;
postgres=# GRANT ALL PRIVILEGES ON DATABASE cia_dev to eris;
```

4. Modify postgres setting, enable prepared transactions

Edit file "/etc/postgresql/9.4/main/postgresql.conf" set

```
max_prepared_transactions = 100
```


5. Modify postgres setting
Edit file "/etc/postgresql/9.4/main/pg_hba.conf" add line

```
host all all ::1/128 md5
```


6. Restart postgres

```
$ service postgresql restart
```

7. Get cia debian package and


```
$ wget https://oss.sonatype.org/content/repositories/releases/com/hack23/cia/cia-dist-deb/2015.12.20/cia-dist-deb-2015.12.20.deb
```


8. Install debian package

```
$ sudo dpkg -i cia-dist-deb-2015.12.20.deb
```


9. Access the server at [http://localhost:2323/cia/](http://localhost:2323/cia/) .