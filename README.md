# Building-Alarm-Manager
Added the bam-broker controller interface and implementation classes for the building electrical system Bam-ES alarm area and the building security system  Bam-SIDS. 

Added two building alarms areas to Kafka broker producer API. 
Added two building alarms consumers to Kafka broker consumer side. 

Manually Test the following classes and methods, using Postman

ControllerBamAreaInterface.
ControllerBes.
ControllerBsids.

BamArea
ConsumerBes
ConsumerBsids
ProducerBes
ProducerBsids
-----------------------------
Alarm recived by the Bam Broker --- simiulated by Post Man.
Consumer: BSIDS acknowledged alarm ReceivedAI505 " Backup Generator Started 
Consumer: BES acknowledged alarm ReceivedAI505 " Backup Generator Started 
BAM-ES: ELECTRICAL SYSTEM SENDS ALARM TO BAM-1
Consumer: BSIDS acknowledged alarm ReceivedAI505 " Backup Generator Started 
Consumer: BES acknowledged alarm ReceivedAI505 " Backup Generator Started 
BAM-ES: ELECTRICAL SYSTEM SENDS ALARM TO BAM-1
Consumer: BSIDS acknowledged alarm ReceivedAI505 " Backup Generator Started 
Consumer: BES acknowledged alarm ReceivedAI505 " Backup Generator Started 
BAM-ES: ELECTRICAL SYSTEM SENDS ALARM TO BAM-1
Consumer: BSIDS acknowledged alarm ReceivedAI505 " Backup Generator Started 
Consumer: BES acknowledged alarm ReceivedAI505 " Backup Generator Started 
BAM-ES: ELECTRICAL SYSTEM SENDS ALARM TO BAM-1
Consumer: BES acknowledged alarm ReceivedAI500 " 3rd story power outage
Consumer: BSIDS acknowledged alarm ReceivedAI500 " 3rd story power outage
BAM-ES: ELECTRICAL SYSTEM SENDS ALARM TO BAM-1
Consumer: BES acknowledged alarm ReceivedAI500 " 3rd story power outage
Consumer: BSIDS acknowledged alarm ReceivedAI500 " 3rd story power outage
BAM-ES: ELECTRICAL SYSTEM SENDS ALARM TO BAM-1
Consumer: BSIDS acknowledged alarm ReceivedAY500 " Smoke detected at 2nd floor
Consumer: BES acknowledged alarm ReceivedAY500 " Smoke detected at 2nd floor
BAM-ES: ELECTRICAL SYSTEM SENDS ALARM TO BAM-1
Consumer: BSIDS acknowledged alarm ReceivedAY500 " Smoke detected at 2nd floor
Consumer: BES acknowledged alarm ReceivedAY500 " Smoke detected at 2nd floor
