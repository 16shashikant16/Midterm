<?php
$servername='localhost';
$username='root';
$password='';
$dbname='mydb';
$conn=mysqli_connect($servername,$username,$password,$dbname);
if(!$conn)
{
	die("could not connect mysql :".mysql_error());
}
if(isset($_POST['save']))
{
$empno=$_POST['empno'];
$name=$_POST['name'];
$address=$_POST['address'];
$sal=$_POST['sal'];
$deptno=$_POST['deptno'];
$sql="insert into employee values ($empno,'$name','$address',$sal,$deptno)";
if(mysqli_query($conn,$sql)){
echo "New Record Inserted";
}
else
{
	echo "Error : ".$sql." ".mysqli_error($conn);
}
mysqli_close($conn);
}
if(isset($_POST['delete']))
{
$empno=$_POST['empno'];
//$name=$_POST['name'];
//$address=$_POST['address'];
//$sal=$_POST['sal'];
//$deptno=$_POST['deptno'];
$sql="delete from employee where empno = $empno";
if(mysqli_query($conn,$sql)){
echo " Record Deleted ";
}
else
{
	echo "Error : ".$sql." ".mysqli_error($conn);
}
mysqli_close($conn);
}
if(isset($_POST['view']))
{
$empno=$_POST['empno'];
//$name=$_POST['name'];
//$address=$_POST['address'];
//$sal=$_POST['sal'];
//$deptno=$_POST['deptno'];
$sql="select * from employee where empno = $empno";
$result=mysqli_query($conn,$sql);
	if(mysqli_num_rows($result)>0)
	{
$row=mysqli_fetch_assoc($result);
echo "Employee no : ".$row['empno']."<br>";
echo "Name : ".$row['name']."<br>";
echo "Address : ".$row['address']."<br>";
echo "Salary : ".$row['sal']."<br>";
echo "Department no : ".$row['deptno']."<br>";

}
}
if(isset($_POST['display']))
{
	$sql="select * from employee order by deptno";
	$result=mysqli_query($conn,$sql);
	if(mysqli_num_rows($result)>0)
	{
		
?>
	<table border=1>
	<th>Employee no </th>
	<th>Employee name </th>
	<th>Address </th>
	<th>Salary </th>
	<th>Department no </th>	
		<?php
		while($row=mysqli_fetch_assoc($result))
		{
			echo "<tr><td>".$row['empno']."</td><td>".$row['name']."</td><td>".$row['address']."</td><td>".$row['sal']."</td><td>".$row['deptno']."</td></tr>";
			
		}
	}
else{
echo "0 result";
}
mysqli_close($conn);
}
?>