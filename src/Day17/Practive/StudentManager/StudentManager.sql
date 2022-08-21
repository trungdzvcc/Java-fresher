create database STUDENTMANAGER
use STUDENTMANAGER;
create table Classs(ClassID int primary key  , ClassName nvarchar(255) , StartDate Date , status int)
create table Students (StudentID int primary key  , StudentName nvarchar(255) , Addressx nvarchar(255) , phone varchar(11), status int , ClassID int ,
 FOREIGN KEY (ClassID) REFERENCES Classs(ClassID))
 
create table Subjects (SubID int primary key   , SubName nvarchar(255) , Credit int , status int )
create table Marks (MarkID int primary key, SubID int , StudentID int , Credit int , status int,
	 FOREIGN KEY (StudentID) REFERENCES Students(StudentID))

alter table Marks 
Modify Foreign key (SubID) references Subjects(SubID);
--Insert Class
 INSERT INTO Classs (ClassID , ClassName, StartDate,Class.status)
VALUES (1, 'A1', '2008-12-20', 1),
 (2, 'A2', '2008-12-22', 1),
 (3, 'B3', CAST( GETDATE() AS Date ), 0);
 select *from Classs
-- Insert Student
INSERT INTO Students(StudentID , StudentName , Addressx,phone , status , ClassID)
VALUES (1,'Hung', 'Ha Noi', '0912113113', 1, 1);
INSERT INTO Students
VALUES (2,'Hoa', 'Hai phong','0375281284', 1, 1);
INSERT INTO Students
VALUES (3,'Manh', 'HCM', '0123123123', 0, 2);

--Query student
 SELECT * FROM Students
WHERE status = 1;


--Insert subject

INSERT INTO Subjects
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);

--Query student
SELECT *FROM Subjects
WHERE Credit < 10;
--Insert Mark
INSERT INTO Marks
VALUES (1,1, 1, 8, 1),
       (2,1, 2, 10, 2),
       (3,2, 1, 12, 1),
	   (4,3, 3, 12, 1)

-- Join student and class 
SELECT S.StudentID , S.StudentName , C.ClassID , C.ClassName , S.status
FROM Students S   join Classs C on S.ClassId = C.ClassID

--List student class name A1
SELECT S.StudentId, S.StudentName, C.ClassName
FROM Students S join Classs C on S.ClassId = C.ClassID
WHERE C.ClassName = 'A1';

--show 
SELECT S.StudentId, S.StudentName, Sub.SubName, M.Credit
FROM Students S join Marks M on S.StudentId = M.StudentId join Subjects Sub on M.SubId = Sub.SubId

--show subject CF
SELECT S.StudentId, S.StudentName, Sub.SubName, M.Credit
FROM Students S join Marks M on S.StudentId = M.StudentId join Subjects Sub on M.SubId = Sub.SubId
WHERE Sub.SubName = 'CF';
