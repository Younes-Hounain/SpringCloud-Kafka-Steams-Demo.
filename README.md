# SpringCloud-Kafka-Streams-Demo

This project is a Spring Boot 3.2.1 application utilizing Kafka and Zookeeper for sending and receiving messages. It employs functional programming with Spring Boot and includes a Smoothie.js library graph displayed in an `index.html` file.

## Table of Contents
1. [Zookeeper and Kafka Setup](#zookeeper-and-kafka-setup)
2. [Project Dependencies](#project-dependencies)
3. [Kafka Commands](#kafka-commands)
4. [Application Screenshots](#application-screenshots)
   - [1. Zookeeper Launched](#1-zookeeper-launched)
   - [2. Kafka Downloaded](#2-kafka-downloaded)
   - [3. Kafka Launched](#3-kafka-launched)
   - [4. Command to Launch Zookeeper](#4-command-to-launch-zookeeper)
   - [5. Fixed Zookeeper Command and Kafka Path](#5-fixed-zookeeper-command-and-kafka-path)
   - [6. Dependencies Used](#6-dependencies-used)
   - [7. First Kafka Test Serialized as JSON](#7-first-kafka-test-serialized-as-json)
   - [8. Key-Value Test from Function kStreamFunction](#8-key-value-test-from-function-kstreamfunction)
   - [9. Improved Function kStreamFunction with Display of Number of Visits](#9-improved-function-kstreamfunction-while-displaying-number-of-visits)
   - [10. R3 Consumer Results After PageEventFunction Change](#10-r3-consumer-results-after-pageeventfunction-change)
   - [11. Confusing Results After Creating Service](#11-confusing-results-after-creating-service)
   - [12. Tests Passed Successfully](#12-tests-passed-successfully)
   - [13. Smoothie Graph Showing After Tests](#13-smoothie-graph-showing-after-tests)
   - [14. Analytics Page Added](#14-analytics-page-added)
   - [15. Logs Generated](#15-logs-generated)

## Zookeeper and Kafka Setup

To set up Zookeeper and Kafka, follow these commands (assuming that the kafka folder is located inside the C: folder for windows):

```powershell
C:\kafka_2.13-3.6.1>start bin\windows\zookeeper-server-start.bat config/zookeeper.properties

C:\kafka_2.13-3.6.1>start bin\windows\kafka-server-start.bat config/server.properties
```

## Project Dependencies

The project uses the following entities and services:

- `PageEvent` class in the `entities` folder.
- `PageEventService` class in the `services` folder, which includes functions for consuming, supplying, and processing page events.
- `PageEventRestController` class in the `web` folder, responsible for handling REST endpoints.
- `index.html` in the `resources/static` folder, displaying a Smoothie.js graph.
- Configuration details in `application.properties`.

## Kafka Commands

Here are some useful Kafka commands for interaction:

```powershell
C:\kafka_2.13-3.6.1>start bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic R1

C:\kafka_2.13-3.6.1>start bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic R1

C:\kafka_2.13-3.6.1>start bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic R2

C:\kafka_2.13-3.6.1>start bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic R3

C:\kafka_2.13-3.6.1>start .\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic R4 --property print.key=true --property print.value=true --property key.deserializer=org.apache.kafka.common.serialization.StringDeserializer --property value.deserializer=org.apache.kafka.common.serialization.LongDeserializer
```

## Application Screenshots

1. ### **Zookeeper Launched**
    ![zookeper_launched](https://github.com/Younes-Hounain/SpringCloud-Kafka-Steams-Demo./assets/93407250/7bbb260c-ee67-4bbc-b6e5-31e8bed8c24d)


2. ### **Kafka Downloaded**
    ![kafka_downloaded](https://github.com/Younes-Hounain/SpringCloud-Kafka-Steams-Demo./assets/93407250/28495dce-5049-4cad-bd7f-e16452d63094)

3. ### **Kafka Launched**
    ![Kafka_launched](https://github.com/Younes-Hounain/SpringCloud-Kafka-Steams-Demo./assets/93407250/db62ab44-4ea8-4c0a-96f4-76500f05e413)

4. ### **Command to Launch Zookeeper**
    ![Command_to_launch_zookeeper](https://github.com/Younes-Hounain/SpringCloud-Kafka-Steams-Demo./assets/93407250/537774f3-ac27-4df6-9696-610ff0a7297e)

5. ### **Fixed Zookeeper Command and Kafka Path**
    ![Fixed_Zookeeper_command_and_kafka_path](https://github.com/Younes-Hounain/SpringCloud-Kafka-Steams-Demo./assets/93407250/ec379db4-918e-49f1-81f2-7d3929f4bd3c)

6. ### **Dependencies Used**
    ![dependencies_used](https://github.com/Younes-Hounain/SpringCloud-Kafka-Steams-Demo./assets/93407250/fa44e54e-0add-4682-9f15-1f3c0ab10f6c)

7. ### **First Kafka Test Serialized as JSON**
    ![First_Kafka_Test_serialized_as_JSON](https://github.com/Younes-Hounain/SpringCloud-Kafka-Steams-Demo./assets/93407250/65ae389e-788d-4c73-94cc-21df4a6c890d)

8. ### **Key-Value Test from Function kStreamFunction**
    ![key_value_test_from_function_kStreamFunction](https://github.com/Younes-Hounain/SpringCloud-Kafka-Steams-Demo./assets/93407250/1d8a58e9-2a6d-4c36-927d-630677718b8c)

9. ### **Improved Function kStreamFunction with Display of Number of Visits**
    ![improved_function_kStreamFunction_while_displaying_number_of_visits](https://github.com/Younes-Hounain/SpringCloud-Kafka-Steams-Demo./assets/93407250/29bc2aba-564f-40ac-9cfb-15d0f1939452)

10. ### **R3 Consumer Results After PageEventFunction Change**
    ![R3_Consumer_results_after_PageEventFunction_Change](https://github.com/Younes-Hounain/SpringCloud-Kafka-Steams-Demo./assets/93407250/e0d436e3-8bb5-4469-b6f0-ca309a888c86)

11. ### **Confusing Results After Creating Service**
    ![confusing_results_after_creating_service](https://github.com/Younes-Hounain/SpringCloud-Kafka-Steams-Demo./assets/93407250/1fcd0bd8-6741-4f01-bce3-5817f0d04e4d)

12. ### **Tests Passed Successfully**
    ![3_Tests_Passed_Successfuly](https://github.com/Younes-Hounain/SpringCloud-Kafka-Steams-Demo./assets/93407250/7a3b600f-5153-432b-98fc-28313d84676b)

13. ### **Smoothie Graph Showing After Tests**
    ![Smoothie_Graph_Showing_after_tests](https://github.com/Younes-Hounain/SpringCloud-Kafka-Steams-Demo./assets/93407250/5d841c2c-d1a5-4887-ad90-76ff9c89b762)

14. ### **Analytics Page Added**
    ![Analytics_page_added](https://github.com/Younes-Hounain/SpringCloud-Kafka-Steams-Demo./assets/93407250/eee179c9-a3f8-4d6f-9983-4280d7f6fe68)

15. ### **Logs Generated**
    ![logs_generated](https://github.com/Younes-Hounain/SpringCloud-Kafka-Steams-Demo./assets/93407250/e6261e2d-c379-4161-a38a-dc712424d3ae)

