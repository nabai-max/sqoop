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