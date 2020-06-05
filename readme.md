# Sqoop project
Sqoop is a data ingestion tool for big data application.

## MySQL
Make sure MySQL is up and running. Use mysql.sh from the `container` repository

```shell script
#!/bin/bash
echo example: sqoop_rdbms.bash jdbc:mysql://172.17.0.2:3306/sakila student password actor /user/student/sakila
# $1: jdbc:mysql:host:port/db 
# $2: user
# $3: password
# $4: table name
# $5: hadoop home for import /user/student/sakila/actor
hdfs dfs -rm -r $5/$4
sqoop import --connect $1 --username $2 --password $3 --table $4 --target-dir $5/$4 -m 1
hdfs dfs -cp -f $5/$4/part-m-00000 $5/$4.csv
```

## example

```shell script
/home/student/cisc_525/sqoop/sqoop_rdbms.bash jdbc:mysql://172.17.0.2:3306/sakila student password actor /user/student/sakila
```
Output will be:
```
/user/student/sakila/actor/part-m-0000
/user/student/sakila/actor.csv

```
#EXPORT THE DATA

```
sqoop export --connect jdbc:mysql://172.17.0.2:3306/airline --username student --password password --table carrier --export-dir /user/student/airline/carriers.csv -m 1
```
