--------------------------------------------------------
--  颇老捞 积己凳 - 格夸老-2岿-16-2023   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Sequence LOGMNR_DIDS$
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."LOGMNR_DIDS$"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  ORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence LOGMNR_EVOLVE_SEQ$
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."LOGMNR_EVOLVE_SEQ$"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  ORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence LOGMNR_SEQ$
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."LOGMNR_SEQ$"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  ORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence LOGMNR_UIDS$
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."LOGMNR_UIDS$"  MINVALUE 100 MAXVALUE 99999 INCREMENT BY 1 START WITH 100 NOCACHE  ORDER  CYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence MVIEW$_ADVSEQ_GENERIC
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."MVIEW$_ADVSEQ_GENERIC"  MINVALUE 1 MAXVALUE 4294967295 INCREMENT BY 1 START WITH 1 CACHE 50 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence MVIEW$_ADVSEQ_ID
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."MVIEW$_ADVSEQ_ID"  MINVALUE 1 MAXVALUE 4294967295 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence ROLLING_EVENT_SEQ$
--------------------------------------------------------

   CREATE SEQUENCE  "SYSTEM"."ROLLING_EVENT_SEQ$"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  ORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Table MEMBER
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."MEMBER" 
   (	"ID" VARCHAR2(30 BYTE), 
	"PW" VARCHAR2(30 BYTE), 
	"NAME" VARCHAR2(30 BYTE), 
	"EMAIL" VARCHAR2(50 BYTE), 
	"AGE" NUMBER(*,0), 
	"GENDER" VARCHAR2(30 BYTE), 
	"PHONENUM" VARCHAR2(30 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table QUEST
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."QUEST" 
   (	"QUEST_ID" VARCHAR2(20 BYTE), 
	"USER_ID" VARCHAR2(30 BYTE), 
	"QUEST_DETAIL" VARCHAR2(200 BYTE), 
	"PRICE" NUMBER(*,0)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table WALLET
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."WALLET" 
   (	"WALLET_ID" VARCHAR2(30 BYTE), 
	"MONEY" NUMBER(*,0)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into SYSTEM.MEMBER
SET DEFINE OFF;
REM INSERTING into SYSTEM.QUEST
SET DEFINE OFF;
REM INSERTING into SYSTEM.WALLET
SET DEFINE OFF;
--------------------------------------------------------
--  Ref Constraints for Table QUEST
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."QUEST" ADD CONSTRAINT "FK_ID" FOREIGN KEY ("USER_ID")
	  REFERENCES "SYSTEM"."MEMBER" ("ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table WALLET
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."WALLET" ADD CONSTRAINT "WALLETFK_ID" FOREIGN KEY ("WALLET_ID")
	  REFERENCES "SYSTEM"."MEMBER" ("ID") ENABLE;
