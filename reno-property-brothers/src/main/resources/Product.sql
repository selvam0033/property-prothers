/*---------------------------------------------------------------------Product----------------------------------------------------------------------------*/

DROP TABLE IF EXISTS Product;
 
CREATE TABLE Product (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  product VARCHAR(250) NOT NULL
 
);


INSERT INTO Product (product)
select 'Select' union all
select 'Cement' union all
select 'Steel' union all
select 'Rock' union all
select 'Brick' union all
select 'Sand';

/*---------------------------------------------------------------------User----------------------------------------------------------------------------*/

DROP TABLE IF EXISTS User;

 CREATE TABLE User (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  user_Name VARCHAR(250) NOT NULL,
  password VARCHAR(250) NOT NULL,
  active BOOLEAN,
  role VARCHAR(250) NOT NULL
);


INSERT INTO User (user_Name,password,active,role)
select 'admin','admin',true,'admin';

/*---------------------------------------------------------------------Bound----------------------------------------------------------------------------*/

DROP TABLE IF EXISTS Bound;
 
CREATE TABLE Bound (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  bound VARCHAR(250) NOT NULL
 
);

INSERT INTO Bound (bound)
select 'Select' union all
select 'IN' union all
select 'OUT';

/*---------------------------------------------------------------------Site----------------------------------------------------------------------------*/

DROP TABLE IF EXISTS Site;

CREATE TABLE Site (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  bound VARCHAR(250) NOT NULL,
  register_Site_Id VARCHAR(250) NOT NULL,
  site_Owner VARCHAR(250) NOT NULL,
  address VARCHAR(250) NOT NULL,
  distict VARCHAR(250) NOT NULL,
  state VARCHAR(250) NOT NULL,
  Zipcode INT,
  sqft INT,
  active BOOLEAN,
  create_date date,
  create_by VARCHAR(250) NOT NULL
);


INSERT INTO Site (bound,register_Site_Id,site_Owner,address,distict,state,Zipcode,sqft,active,create_date,create_by)
select  'IN','MDU-S-IN-1','Machakkalai','Masthanpatti','Madurai','TN',625020,2000,true,CURRENT_TIMESTAMP(),'admin' union all
select  'OUT','MDU-S-OUT-1','pandiselvam','karupayaurni','Madurai','TN',625020,2000,true,CURRENT_TIMESTAMP(),'admin';

/*---------------------------------------------------------------------Dealer----------------------------------------------------------------------------*/

DROP TABLE IF EXISTS Dealer;

CREATE TABLE Dealer (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  dealer_Address VARCHAR(250) NOT NULL,
  product VARCHAR(250) NOT NULL,
  product_id Int,
  unit_Price int,
  active BOOLEAN,
  create_date date,
  create_by VARCHAR(250) NOT NULL
);


INSERT INTO Dealer (name,dealer_Address,product,product_id,unit_Price,active,create_date,create_by)
select  'RAMCO','MADURAI','Cement',2,190,true,CURRENT_TIMESTAMP(),'admin' union all
select  'RANATOR','MADURAI','Steel',3,250,true,CURRENT_TIMESTAMP(),'admin' union all
select  'M-Sand','MADURAI','Sand',6,25000,true,CURRENT_TIMESTAMP(),'admin' union all
select  'R-Sand','MADURAI','Sand',6,35000,true,CURRENT_TIMESTAMP(),'admin' union all
select  'S-Brick','MADURAI','Brick',5,35000,true,CURRENT_TIMESTAMP(),'admin' union all
select  'C-Brick','MADURAI','Brick',5,35000,true,CURRENT_TIMESTAMP(),'admin' union all
select  '0.5-Inc','MADURAI','Rock',4,35000,true,CURRENT_TIMESTAMP(),'admin' union all
select  '1-Inc','MADURAI','Rock',4,35000,true,CURRENT_TIMESTAMP(),'admin';

/*---------------------------------------------------------------------sale----------------------------------------------------------------------------*/

DROP TABLE IF EXISTS sale;

CREATE TABLE sale(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  saleid VARCHAR(250) NOT NULL,
  site VARCHAR(250) NOT NULL,
  bound VARCHAR(250) NOT NULL,
  dealer VARCHAR(250) NOT NULL,
  product VARCHAR(250) NOT NULL,
  unit int,
  total_Price int,
  current_Price int,
  create_date date,
  create_by VARCHAR(250) NOT NULL
  
);


INSERT INTO sale(saleid,site,bound,dealer,product,unit,total_Price,current_Price,create_date,create_by)
select  'SAL-0','MDU-S-IN-1','IN','RAMCO','Cement',12,1200,190,CURRENT_TIMESTAMP(),'admin';


/*---------------------------------------------------------------------ProductRegistration----------------------------------------------------------------------------*/

DROP TABLE IF EXISTS Productregistration;

CREATE TABLE Productregistration(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  prod_Reg_Id VARCHAR(250) NOT NULL,
  product VARCHAR(250) NOT NULL,
  dealer_Name VARCHAR(250) NOT NULL, 
  grade VARCHAR(250) NOT NULL,   
  active boolean,
  create_date date,
  create_by VARCHAR(250) NOT NULL,
  sale_Price int,
  purchase_Price int

);


INSERT INTO Productregistration(product,prod_Reg_Id,dealer_Name,grade,active,create_date,create_by,sale_Price ,purchase_Price  )
select  'Cement','REGID-1','RAMCO','A',true,CURRENT_TIMESTAMP(),'admin',190,200;

/*---------------------------------------------------------------------WorkCategory----------------------------------------------------------------------------*/

DROP TABLE IF EXISTS WorkCategory;
 
CREATE TABLE WorkCategory (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  work_Category VARCHAR(250) NOT NULL
 
);


INSERT INTO WorkCategory (work_Category)
select 'Niminthal' union all
select 'Chithal' union all
select 'Kothanar' union all
select 'SteelWorker';

/*---------------------------------------------------------------------Employee----------------------------------------------------------------------------*/

DROP TABLE IF EXISTS Employee;
 
CREATE TABLE Employee (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  empId VARCHAR(250) NOT NULL,
  name VARCHAR(250) NOT NULL,
  address VARCHAR(250) NOT NULL,
  work VARCHAR(250) NOT NULL,
  phone VARCHAR(250) NOT NULL,
  referal VARCHAR(250) NOT NULL
  );
  
INSERT INTO Employee (empId,name,address,work,phone,referal)
select 'EMP-1','Pandiselvam','MADURAI','Kothanar','9994205331','pandi' union all
select 'EMP-2','Pandiselvam','MADURAI','Kothanar','9994205331','pandi';


/*---------------------------------------------------------------------Purchase----------------------------------------------------------------------------*/

DROP TABLE IF EXISTS Purchase;

CREATE TABLE Purchase(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  purchaseid VARCHAR(250) NOT NULL,
  site VARCHAR(250) NOT NULL,
  bound VARCHAR(250) NOT NULL,
  dealer VARCHAR(250) NOT NULL,
  product VARCHAR(250) NOT NULL,
  unit int,
  total_Price int,
  current_Price int,
  create_date date,
  create_by VARCHAR(250) NOT NULL
  
);


INSERT INTO Purchase(purchaseid,site,bound,dealer,product,unit,total_Price,current_Price,create_date,create_by)
select  'PURID-0','MDU-S-IN-1','IN','RAMCO','Cement',12,1200,190,CURRENT_TIMESTAMP(),'admin';

/*---------------------------------------------------------------------District----------------------------------------------------------------------------*/

DROP TABLE IF EXISTS District;
 
CREATE TABLE District (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  district VARCHAR(250) NOT NULL
 
);


INSERT INTO District (district)
select 'Select' union all
select 'Madurai' union all
select 'Chennai';
/*---------------------------------------------------------------------Categorytype Query----------------------------------------------------------------------------*/

DROP TABLE IF EXISTS Categorytype;
 
CREATE TABLE Categorytype (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  category_Type VARCHAR(250) NOT NULL
 
);


INSERT INTO Categorytype (Category_Type)
select 'Concrete' union all
select 'Construction';

/*---------------------------------------------------------------------Constuctiontype Query----------------------------------------------------------------------------*/

DROP TABLE IF EXISTS Constuctiontype;
 
CREATE TABLE Constuctiontype (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  category_Type VARCHAR(250) NOT NULL,
  constuction_Type VARCHAR(250) NOT NULL
 
);


INSERT INTO Constuctiontype (category_Type,constuction_Type)
select 'Concrete','Pillar Pool Concrete' union all
select 'Concrete','Lindal Concrete' union all
select 'Concrete','Roof' union all
select 'Constuction','Lindal down Construction' union all
select 'Constuction','Lindal UP Construction' union all
select 'Constuction','Basement Construction';



/*---------------------------------------------------------------------All select Query----------------------------------------------------------------------------*/
select * from Constuctiontype;
select * from Categorytype;
select * from District;
select * from Purchase;
select * from Employee;
select * from WorkCategory;
select * from Productregistration;
select * from sale;
select * from Dealer;
select * from User;
select * from Product;
select * from Bound;
select * from site;


 