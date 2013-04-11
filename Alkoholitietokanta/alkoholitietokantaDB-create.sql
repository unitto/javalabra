create table juoma (
  id                        integer AUTOINCREMENT primary key,
  name                      varchar(255),
  juoman_kuvaus             varchar(255),
  juoman_alkoholiprosentti  double,
  lisaaja_tunnus            varchar(255))
;

create table kayttaja (
  tunnus                    varchar(255) primary key,
  salasana                  varchar(255))
;

alter table juoma add constraint fk_juoma_lisaaja_1 foreign key (lisaaja_tunnus) references kayttaja (tunnus);
create index ix_juoma_lisaaja_1 on juoma (lisaaja_tunnus);


