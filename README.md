# Kafka-
Here we can produce messages by producer and consume by consumer
Apache Kafka:
 
A)Introduction :
1. Apache Kafka is an open-source distributed event streaming platform used for building real-time data pipelines and streaming applications. 
2. It is concept where we have to create new topic and producer will produce that topic and consumer can consume that topic. We can craete more than one consumer. 
3.In simply word Apche kafka is used to communication used to build real time transfer information. It is distributed event straming platform.


B)Installation of Apache kafka :

1. Download kafka zip file official website. File will get download in tgz formate in order to extract file open cmd in file path and put command :- tar -xvzf kafka_2.12 2.4.1.tgz (make sure to change version 2.4.1 according to file).
2. Extract file.

C) Configration:

In orderd to start we have to use cmd. In that we can start zookeeper and kafka server.

1. Start Zookeeper.
C:\kafka_2.13-3.5.0>bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

2. Start Kafka Server
C:\kafka_2.13-3.5.0>bin\windows\kafka-server-start.bat .\config\server.properties

3. Now we have to create new topic in cmd.
C:\kafka_2.13-3.5.0>.\bin\windows\kafka-topics.bat --create --topic user-topic --bootstrap-server localhost:9092

4. Produce new topic 
bin\windows\kafka-console-producer.bat --topic user-topic --bootstrap-server localhost:9092

5.Consuming message
bin\windows\kafka-console-consumer.bat --topic user-topic --from-beginning --bootstrap-server localhost:9092

Note: we can create more than one consumer.

---------------------------------------------------


We did this in cmd. Now we will impliment in spring boot.

Implimenation:
A.Delevry boy:
1. Create one microservice 
2. Add Dependency as Spring web, Spring for Apache kafka.
This service will get used to produce location update


B.EndUser:
1.Create anothere microservice 
2.Add dependency as Spring web, Spring for Apache kafka.
This service will get used to consume location update
