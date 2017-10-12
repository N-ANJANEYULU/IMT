CREATE TABLE table_name(column_name column_type);
Create  table consumer_groups(
consumergroup_id int PRIMARY KEY AUTO_INCREMENT,
consumer_id int,
brand VARCHAR(20),
Mbu VARCHAR(20),
region VARCHAR(50),
hc_id int,
first_Name VARCHAR(30),
last_name varchar(30),
dob Date,
group_id int,
Member_no int, 
Create_Dt Date, 
Create_id int) 

INSERT INTO consumer_groupS ( consumergroup_id,consumer_id,brand,Mbu,region)VALUES( 1, 50, 'acc', 'chennai','TN');
INSERT INTO consumer_groupS ( consumergroup_id,consumer_id,brand,Mbu,region)VALUES( 2, 49, 'acc', 'vijaywada','AP');
INSERT INTO consumer_groupS ( consumergroup_id,consumer_id,brand,Mbu,region)VALUES( 3, 48, 'acc', 'Hyderbad','TS');
INSERT INTO consumer_groupS ( consumergroup_id,consumer_id,brand,Mbu,region)VALUES( 4, 47, 'acc', 'bengalour','KA');
INSERT INTO consumer_groupS ( consumergroup_id,consumer_id,brand,Mbu,region)VALUES( 5, 46, 'acc', 'mumbai','MH');

ALTER TABLE consumer_group add PRIMARY KEY(consumergroup_id);
ALTER TABLE consumer_group MODIFY COLUMN consumergroup_id INT auto_increment;
