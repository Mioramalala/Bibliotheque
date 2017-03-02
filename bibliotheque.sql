/*==============================================================*/
/* DBMS name:      PostgreSQL 8                                 */
/* Created on:     02/03/2017 15:49:39                          */
/*==============================================================*/


drop index CATEGORIE_PK;

drop table CATEGORIE;

drop index ASSOCIATION_1_FK;

drop index OUVRAGE_PK;

drop table OUVRAGE;

drop index ASSOCIATION_5_FK;

drop index PERSONNE_PK;

drop table PERSONNE;

drop index ASSOCIATION_3_FK;

drop index ASSOCIATION_2_FK;

drop index PRET_PK;

drop table PRET;

drop index ASSOCIATION_4_FK;

drop index RETOURPRET_PK;

drop table RETOURPRET;

drop index TYPE_PK;

drop table TYPE;

/*==============================================================*/
/* Table: CATEGORIE                                             */
/*==============================================================*/
create table CATEGORIE (
   IDCATEGORIE          SERIAL               not null,
   CODECATEGORIE        VARCHAR(10)          not null,
   LIBELLECATEGORIE     VARCHAR(20)          null,
   DUREEEMPRUTNCAT      INT4                 null,
   PENALITECAT          INT4                 null,
   constraint PK_CATEGORIE primary key (IDCATEGORIE)
);

/*==============================================================*/
/* Index: CATEGORIE_PK                                          */
/*==============================================================*/
create unique index CATEGORIE_PK on CATEGORIE (
IDCATEGORIE
);

/*==============================================================*/
/* Table: OUVRAGE                                               */
/*==============================================================*/
create table OUVRAGE (
   IDOUVRAGE            SERIAL               not null,
   IDCATEGORIE          INT4                 not null,
   CODEOUVRAGE          VARCHAR(10)          not null,
   TITRREOUVRAGE        VARCHAR(50)          null,
   AUTEUROUVRAGE        VARCHAR(50)          null,
   EDITEUROUVRAGE       VARCHAR(50)          null,
   NOMBREPAGE           INT4                 null,
   NOMBREOUVRAGE        INT4                 null,
   constraint PK_OUVRAGE primary key (IDOUVRAGE)
);

/*==============================================================*/
/* Index: OUVRAGE_PK                                            */
/*==============================================================*/
create unique index OUVRAGE_PK on OUVRAGE (
IDOUVRAGE
);

/*==============================================================*/
/* Index: ASSOCIATION_1_FK                                      */
/*==============================================================*/
create  index ASSOCIATION_1_FK on OUVRAGE (
IDCATEGORIE
);

/*==============================================================*/
/* Table: PERSONNE                                              */
/*==============================================================*/
create table PERSONNE (
   IDMEMBRE             SERIAL               not null,
   IDTYPE               INT4                 not null,
   CODEMEMBRE           VARCHAR(10)          not null,
   NOMMEMBRE            VARCHAR(10)          null,
   PRENOMMEMBRE         VARCHAR(30)          null,
   ADRESSEMEMBRE        VARCHAR(50)          null,
   CONTACT              INT4                 null,
   constraint PK_PERSONNE primary key (IDMEMBRE)
);

/*==============================================================*/
/* Index: PERSONNE_PK                                           */
/*==============================================================*/
create unique index PERSONNE_PK on PERSONNE (
IDMEMBRE
);

/*==============================================================*/
/* Index: ASSOCIATION_5_FK                                      */
/*==============================================================*/
create  index ASSOCIATION_5_FK on PERSONNE (
IDTYPE
);

/*==============================================================*/
/* Table: PRET                                                  */
/*==============================================================*/
create table PRET (
   IDPRET               SERIAL               not null,
   IDMEMBRE             INT4                 null,
   IDOUVRAGE            INT4                 not null,
   CODEPRET             VARCHAR(10)          not null,
   DATEEMPRUNT          DATE                 null,
   constraint PK_PRET primary key (IDPRET)
);

/*==============================================================*/
/* Index: PRET_PK                                               */
/*==============================================================*/
create unique index PRET_PK on PRET (
IDPRET
);

/*==============================================================*/
/* Index: ASSOCIATION_2_FK                                      */
/*==============================================================*/
create  index ASSOCIATION_2_FK on PRET (
IDOUVRAGE
);

/*==============================================================*/
/* Index: ASSOCIATION_3_FK                                      */
/*==============================================================*/
create  index ASSOCIATION_3_FK on PRET (
IDMEMBRE
);

/*==============================================================*/
/* Table: RETOURPRET                                            */
/*==============================================================*/
create table RETOURPRET (
   IDRETOUR             SERIAL               not null,
   IDPRET               INT4                 not null,
   DATERETOUR           DATE                 null,
   constraint PK_RETOURPRET primary key (IDRETOUR)
);

/*==============================================================*/
/* Index: RETOURPRET_PK                                         */
/*==============================================================*/
create unique index RETOURPRET_PK on RETOURPRET (
IDRETOUR
);

/*==============================================================*/
/* Index: ASSOCIATION_4_FK                                      */
/*==============================================================*/
create  index ASSOCIATION_4_FK on RETOURPRET (
IDPRET
);

/*==============================================================*/
/* Table: TYPE                                                  */
/*==============================================================*/
create table TYPE (
   IDTYPE               SERIAL               not null,
   LIBELLETYPE          VARCHAR(10)          null,
   constraint PK_TYPE primary key (IDTYPE)
);

/*==============================================================*/
/* Index: TYPE_PK                                               */
/*==============================================================*/
create unique index TYPE_PK on TYPE (
IDTYPE
);

alter table OUVRAGE
   add constraint FK_OUVRAGE_ASSOCIATI_CATEGORI foreign key (IDCATEGORIE)
      references CATEGORIE (IDCATEGORIE)
      on delete restrict on update restrict;

alter table PERSONNE
   add constraint FK_PERSONNE_ASSOCIATI_TYPE foreign key (IDTYPE)
      references TYPE (IDTYPE)
      on delete restrict on update restrict;

alter table PRET
   add constraint FK_PRET_ASSOCIATI_OUVRAGE foreign key (IDOUVRAGE)
      references OUVRAGE (IDOUVRAGE)
      on delete restrict on update restrict;

alter table PRET
   add constraint FK_PRET_ASSOCIATI_PERSONNE foreign key (IDMEMBRE)
      references PERSONNE (IDMEMBRE)
      on delete restrict on update restrict;

alter table RETOURPRET
   add constraint FK_RETOURPR_ASSOCIATI_PRET foreign key (IDPRET)
      references PRET (IDPRET)
      on delete restrict on update restrict;

