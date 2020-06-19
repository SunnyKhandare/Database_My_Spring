create table  person(

id INTEGER not null ,
name varchar(255) not null ,
location varchar(255) ,
birthdate timestamp ,
primary key( id )

);

INSERT INTO PERSON( id , name , location , birthdate ) VALUES( 10001 , 'Ranga' , 'Hyderabad' , sysdate() );
INSERT INTO PERSON( id , name , location , birthdate ) VALUES( 10002 , 'Sunny' , 'Pune' , sysdate() );
INSERT INTO PERSON( id , name , location , birthdate ) VALUES( 10003 , 'Anjali' , 'Pune' , sysdate() );