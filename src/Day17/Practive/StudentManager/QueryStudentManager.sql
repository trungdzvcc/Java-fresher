use STUDENTMANAGER
-- show student to name = H
select * from Students
where StudentName like 'H%'

--show class to start date = 12
select * from Classs
where StartDate like '%-12-%'	

select * from Subjects
where Credit>=3 and Credit <=5		

UPDATE Students 
SET ClassID = 2
WHERE  StudentName = 'Hung'
Select * from Students

--Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
UPDATE Marks 
SET Credit = 8
WHERE  MarkID = 2
Select * from Marks

SELECT S.StudentName, Sub.SubName, M.Credit
FROM Students S join Marks M on S.StudentId = M.StudentId join Subjects Sub on M.SubId = Sub.SubId
ORDER BY Credit DESC , StudentName ASC