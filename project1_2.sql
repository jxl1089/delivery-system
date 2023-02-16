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
--  DDL for Function LOGMNR$COL_GG_TABF_PUBLIC
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE FUNCTION "SYSTEM"."LOGMNR$COL_GG_TABF_PUBLIC" wrapped
a000000
1
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
8
237 185
nkvJV1w6wH1y7mRApzf9mGuebNUwgxDILkhGfHQCmP8+Vi4fyqh3SG1Fyq+pCts1OlgnK761
YuzKBA4JE5DNwZzBIF/Y4ZM5eUlquVyTkOg+AodK3vQJt9NLvPITXbP42O37gO+zKr4BQEJk
ypwrP1U/Pf6MLZONN8LUaVqHCN87T14HqHs5taX7LhLXQ2lCVBE1Ll8dyB9CDOlbyvQS/lrb
+0n1pQi9IJAWySL85ChAqnTaqFJm0YeToD4lZ8UUPQqIZNoX0x73WK9OzsmdBrvEC97iduxe
PEXVkxF6xklPod6yOGBvW7DAFMBgf+LajDLVKOAwB2EAiKCXYMuTUTtMYYkCFFf4sj1rCpsj
TLth6TSru530aM2HP6bEbm3m

/
--------------------------------------------------------
--  DDL for Function LOGMNR$GSBA_GG_TABF_PUBLIC
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE FUNCTION "SYSTEM"."LOGMNR$GSBA_GG_TABF_PUBLIC" wrapped
a000000
1
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
8
206 171
6gxi/CQwK1I5Rfwuw/SXrOGpVRYwgwLI1yfbfHRGEjNe54OE4QwRZCoA20oG536tzgcBrj+1
xE3tE8jIhAoTlUdUmkdYMmZycO1SdiJZwwt/6BrM1wHXl/E5+3Ip2NXzC9j8v4+KjkD9d5AT
p05eEsEWjU1CBTMSpjZZrXzbgFl9QNnQ+zJGjSug21f76ajs78m6anxz7vFcTcem6XpAgKjc
EXzd/ijP8qiOqwblTfnXcRslJn3MljD02u+5fh9NBctOmnaw/tOjRCFPUhY8I9gCoMptjG7U
rHEIFzHOFyxBEdulRGq4ngSgcm7l2yOdSHgNM8rO2vUH4gozvJoLE1S8GBBzG/wrvHPhACQ/
2w==

/
--------------------------------------------------------
--  DDL for Function LOGMNR$KEY_GG_TABF_PUBLIC
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE FUNCTION "SYSTEM"."LOGMNR$KEY_GG_TABF_PUBLIC" wrapped
a000000
1
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
8
2a0 1a1
3O4I5hDO715d8A2tqbxMCflFW0owg/D319xqfC9Grfg+K6yE71zMvtNS45AyRXBk77WpI5v4
nUSfE2lbvUYgk3JHySIe28XxC3xIYYpPGQjxwa3GzPw0FN5aN6kerQQTHUBp29Dd+vLSgBaC
2pAFrq059ZvN0ZPN11XG/2RuDY7HaTQu/QffhnY8rVlNxpFmbkVidwtZQahx5qIFu9Uww/tv
o1AvhjaORi898/KiPtOqv7LpsPFbyNuMnZEG48cxtZuesMBJFP/bKtgU2DN69xiT8Pxf+N2n
g0D2ximYzZqwY/4dBQj9dyQDuXRFo40hdqtWw0L96zV6723aQ8Xp0cqBaZj2wWTI4+6Ikry9
zY0Mdm3bV8TYqsOa+zT4fnikGO0eYbTFHEiW9QUbl/UwzuERwk8p

/
--------------------------------------------------------
--  DDL for Function LOGMNR$SEQ_GG_TABF_PUBLIC
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE FUNCTION "SYSTEM"."LOGMNR$SEQ_GG_TABF_PUBLIC" wrapped
a000000
1
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
8
249 181
++dDv/cHZatK7/vHG9lvR8DQCpYwg/D3AEhqfHQC2h6ONoOvOeHvTNX1S5GDyajM4j8vkSVz
IMw+LbYS3goujprvmrB/LUpdBF8TVvjEqZpC7MCKPXWcGnTeL7ja8C2tcOdjOpRXkwL5NmPJ
B0KqMvwepdiQDY7HUDQrBddQC1lBqHGEogWkwRJ3+2+jUC+Gpo5GTazIWS0V551NkSl3+h0W
BhkPglLbvQDPzxWTnmu4ZuJIlTiNwTf1R0WxghyyKFjES9CJsCrGT8Fn7prlF4Mr5kx1YBGf
5xaODtRnmVJgb65RlKbAN9+Xxf2QnQjKQL99RZAgsEwGVKNfx9lFKwHLGUwzjOxmIAXXYd/Z
+L9osPQJjZYkNrD0pQ==

/
--------------------------------------------------------
--  DDL for Function LOGMNR$TAB_GG_TABF_PUBLIC
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE FUNCTION "SYSTEM"."LOGMNR$TAB_GG_TABF_PUBLIC" wrapped
a000000
1
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
8
22e 181
PRVt0FiLRPgjIhZlCZcQhnOHXQ4wgzJp2UhGfHSKrQ843hKm3gKD9swoFAS4jVcW0CsSl7W1
6banVWdjktOVM18XyRjY4ZM5eRdquSp0ZdfHl3KJPBYqPi9LXIwum30Qh7ymgO+zTKj+R1N2
nSs/TPnknfYLwcUdAfBryDQGEIMisMuE9XT5ix3sudhHa5tLJRjsBIDKlqL7zk2CH0C1NRAZ
XrP7WgavVdNS3Yikz88VupZG21hTuAGspJBgCagmNWIwi9pgCIWP3rxF4p+uMps/ABEg+MBP
6Iykm62kO6hWhVHJXkfKF/jrQFjYBTTzatr1VTcOXt/AFuagDR7isNtb//lnXh8TXyAFWyCT
ubv6GXL0aM0PP/t+DfSl

/
--------------------------------------------------------
--  DDL for Function LOGMNR$USER_GG_TABF_PUBLIC
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE FUNCTION "SYSTEM"."LOGMNR$USER_GG_TABF_PUBLIC" wrapped
a000000
1
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
abcd
8
272 191
Vc+i+Mga8m7/BSlvXl0J+GmParYwg/D319wCfC8CTE6Ot30G8QRR0WzR8ohw8Z/y6DuL4pL5
IDjZApnCaZgeKa1OTjLj2B2tOYZg2ZuOAPKrxo7DeBqtn0Ahw0tubS36jP4xc+d2eQebdJMD
c/U0JxdiAl0qIPzsltBjeoGAEsxUk0aubCMJmysgc2d8ojil6ixQ37D7RA0HWMkh27QdOuXF
vSwuufDunMMT8Hue9dvy4vRXj+PhuyylJSukStsxyIb234EahCXyrjDlnzbC91eoU7v5sb4D
OvtDmggQCEViyhFXwspP9P0dOObin8JENsDJeFZYr/oVAgSHa97LRKvNZgd+f//XHlpEAOP4
rNm5mF0wTCABbb7tc5c7uo09M+79i7en8g==

/
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
