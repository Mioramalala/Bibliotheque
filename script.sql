create sequence seqcat start 101;
create sequence seqouvr start 101;
create sequence seqpers start 101;
create sequence seqpret start 101;

insert into CATEGORIE(CODECATEGORIE,LIBELLECATEGORIE,DUREEEMPRUTNCAT,PENALITECAT) values(nextval('seqcat')||'cat','Roman',10,20);
insert into CATEGORIE(CODECATEGORIE,LIBELLECATEGORIE,DUREEEMPRUTNCAT,PENALITECAT) values(nextval('seqcat')||'cat','Bande dessinees',15,15);
insert into CATEGORIE(CODECATEGORIE,LIBELLECATEGORIE,DUREEEMPRUTNCAT,PENALITECAT) values(nextval('seqcat')||'cat','Poesie',10,15);
insert into CATEGORIE(CODECATEGORIE,LIBELLECATEGORIE,DUREEEMPRUTNCAT,PENALITECAT) values(nextval('seqcat')||'cat','Aventure',18,20);
insert into CATEGORIE(CODECATEGORIE,LIBELLECATEGORIE,DUREEEMPRUTNCAT,PENALITECAT) values(nextval('seqcat')||'cat','Policier',15,20);

insert into TYPE(LIBELLETYPE) values('Membre');
insert into TYPE(LIBELLETYPE) values('Admin');

delele from CATEGORIE where 1=1;