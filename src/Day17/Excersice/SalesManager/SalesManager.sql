create database SalesManager
use SalesManager;


--Create table Customer
create table Customer(cID int primary key  ,Name nvarchar(25) , cAge int)
--Insert customer
INSERT INTO Customer
VALUES (1, 'Minh Quan',10),
       (2, 'Ngoc Oanh', 20),
       (3, 'Hong Ha', 50)


--Create table Order
create table Orders (oID int primary key  , cID int , oDate Datetime , oTotalPrice int ,
 FOREIGN KEY (cID) REFERENCES Customer(cID))
 --Insert Order
 INSERT INTO Orders
VALUES (1, 1,'3/21/2006', null),
       (2, 2, '3/23/2006', null),
       (3, 1, '3/16/2006', null)


 --Create table Product
 create table Product(pID int primary key  ,pName nvarchar(25) , pPrice int)
 --insert Product
 INSERT INTO Product
VALUES (1, 'May Giat', 3),
       (2, 'Tu lanh', 5),
       (3, 'Dieu Hoa', 7),
       (4, 'Quat', 1),
	    (5, 'Bep Dien', 2);



  --Create table Order detail
 create table OrderDetail(oID int ,pID int , odQTY int,
  FOREIGN KEY (oID) REFERENCES Orders(oID),
  FOREIGN KEY (pID) REFERENCES Product(pID)
  )
  --Insert Order detail
   INSERT INTO OrderDetail
VALUES (1, 1, 3),
       (1, 3, 7),
       (1, 4, 2),
       (2, 1, 1),
	   (3, 1, 8),
	   (2, 5, 4),
	   (2, 3, 3);


--Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select oID , oDate , oTotalPrice from Orders
--Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách

SELECT C.cID,C.Name ,C.cAge , O.oDate ,p.pID , p.pName , p.pPrice
FROM OrderDetail OD join Orders O on OD.oID = O.oID join Product p on OD.pID = p.pID join Customer C on C.cID = O.cID

--Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
SELECT C.cID,C.Name ,C.cAge 
FROM Customer C 
Where C.cID NOT IN (select ord.cID From Orders ord)

--Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
