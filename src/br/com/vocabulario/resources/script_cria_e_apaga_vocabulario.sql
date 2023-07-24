DROP TABLE "TM_MIGUEL_LIMA"."T_VOC_DICTIONARY"; 
--------------------------------------------------------
  CREATE TABLE "TM_MIGUEL_LIMA"."T_VOC_DICTIONARY" 
   (	"CD_ID" NUMBER(4,0), 
	"NM_CHAVE" VARCHAR2(30 BYTE), 
	"NM_VALOR" VARCHAR2(30 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TBSPC_ALUNOS" ;

   COMMENT ON COLUMN "TM_MIGUEL_LIMA"."T_VOC_DICTIONARY"."CD_ID" IS 'id para localizar o par Map(K, V)';
   COMMENT ON COLUMN "TM_MIGUEL_LIMA"."T_VOC_DICTIONARY"."NM_CHAVE" IS 'nome da palavra em portugues, ou seja, a traducao da palavra';
   COMMENT ON COLUMN "TM_MIGUEL_LIMA"."T_VOC_DICTIONARY"."NM_VALOR" IS 'nome da palavra em ingeles, ou seja, a palavra que sera traduzida';
REM INSERTING into TM_MIGUEL_LIMA.T_VOC_DICTIONARY
SET DEFINE OFF;
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('1','fundamental','elementary');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('2','cada','each');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('3','inicio','beginning');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('4','conteudo','contents');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('5','escolher','choose');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('21','fazer','made');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('22','destinado','intended');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('23','medir','measure');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('24','utilizacao','usage');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('25','quais','which');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('26','guia','guide');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('27','funciona','works');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('28','deixar','give');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('29','ativo','active');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('30','promove','promotes');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('31','formulario','forms');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('32','recursos','features');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('33','variar','differ');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('34','acordo','deal');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('35','ensinou','taught');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('36','dirigido','addressed');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('37','perto','near');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('38','bem','well');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('39','chuveiro','shower');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('40','inverno','winter');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('41','local','site');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('42','falar','tell');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('43','carne','meat');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('44','pao','bread');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('45','a_partir','starting');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('46','manteiga','butter');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('47','novo_e_folha','bread_new');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('48','riacho','creak');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('49','rio','river');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('50','lago','lake');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('51','manteiga','butter');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('52','novo_e_folha','bread_new');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('53','riacho','creak');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('54','rio','river');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('55','lago','lake');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('56','piscina','pool');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('57','suficiente','enough');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('58','sempre','always');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('59','roubar','steal');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('60','xingar','course');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('61','morrendo_de_fome','starving');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('62','atrasar','late');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('63','labios','lips');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('64','cavalo','house');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('65','graveto','stick');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('66','vidro','glass');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('67','vender','sell');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('68','mar','sea');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('69','atualmente','currently');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('70','seguradora','insurance');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('71','nasceu','born');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('72','vivo','alive');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('73','manter','keep');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('74','oculos','glasses');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('75','emprestar','lend');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('76','parceiros','partners');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('77','forte','stronger');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('78','monitoramento','tracking');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('79','manter','remain');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('80','doente','sick');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('81','sozinho','alone');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('82','instalacao','facilaty');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('83','significar','mean');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('84','quente','warm');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('85','monitorar','monitor');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('86','confiante','confident');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('87','voou','flew');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('88','escondido','hiding');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('89','estranho','weird');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('90','assegurar','assure');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('91','inesquecivel','unforgettable');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('92','ficar','stay');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('93','juntos','together');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('94','tubo','tube');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('95','solto','loose');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('96','lei','law');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('97','menos','less');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('98','com_medo','afraid');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('99','parafusar','screw');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('100','prateleira','shelf');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('101','barba','beard');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('102','movimentadas','bustling');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('103','correndo','rushed');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('104','diariamente','daily');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('105','recados','errands');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('106','fresco','fresh');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('107','artesanal','handmade');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('108','artesanato','crafts');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('109','palpite','hunch');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('110','trazendo','bringing');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('111','ambos','both');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('112','preso','stuck');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('113','arrepios','creeps');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('114','feliz','glad');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('115','inteligente','smart');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('116','noivo','groom');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('117','uniao','togetherness');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('118','perdoar','forgive');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('119','puxado','pulled');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('120','filho','son');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('121','substituir','replace');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('122','roubou','stole');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('123','carne_de_porco','pork');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('124','voltando','comming_back');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('125','encontro','meeting');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('126','procurar','find');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('127','ouvir','hear');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('128','xadrez','chess');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('129','montar','ride');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('130','cavaleiro','knight');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('131','tempestade','storm');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('132','dispositivos','devices');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('133','acima','above');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('134','alvo','target');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('135','poder','might');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('136','chegar','arrive');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('137','viajar','travel');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('138','vendido','should');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('139','morto','dying');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('140','processos','suit');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('141','anel','ring');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('142','bastante','quite');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('143','me_perguntando','wondering');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('144','gostaria','would');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('145','louco','nuts');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('146','parece','seems');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('147','poderia','could');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('148','escuridao','blackness');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('149','preso','trapped');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('150','queimar_se','burn_up');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('151','entrada','entry');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('152','forcada','forcible');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('153','duvida','doubts');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('154','limpeza','clearing');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('155','acontecendo','happening');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('156','desde_que','since');
Insert into TM_MIGUEL_LIMA.T_VOC_DICTIONARY (CD_ID,NM_CHAVE,NM_VALOR) values ('157','que','than');
--------------------------------------------------------
--  DDL for Index T_VOC_DATABASE_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "TM_MIGUEL_LIMA"."T_VOC_DATABASE_PK" ON "TM_MIGUEL_LIMA"."T_VOC_DICTIONARY" ("CD_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TBSPC_ALUNOS" ;
--------------------------------------------------------
--  Constraints for Table T_VOC_DICTIONARY
--------------------------------------------------------

  ALTER TABLE "TM_MIGUEL_LIMA"."T_VOC_DICTIONARY" MODIFY ("CD_ID" NOT NULL ENABLE);
  ALTER TABLE "TM_MIGUEL_LIMA"."T_VOC_DICTIONARY" MODIFY ("NM_CHAVE" NOT NULL ENABLE);
  ALTER TABLE "TM_MIGUEL_LIMA"."T_VOC_DICTIONARY" MODIFY ("NM_VALOR" NOT NULL ENABLE);
  ALTER TABLE "TM_MIGUEL_LIMA"."T_VOC_DICTIONARY" ADD CONSTRAINT "T_VOC_DATABASE_PK" PRIMARY KEY ("CD_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TBSPC_ALUNOS"  ENABLE;
