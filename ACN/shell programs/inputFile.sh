# Read student details as user input and store them in a file and display them.

echo "enter students details :"
read -p "enter Name: " name
read -p "enter rollno: " rollno
read -p "course :" course
read -p "enter file name: " fname
if [ -f $fname ]
then 
    echo "students details :" > $fname
    echo "Name: $name" >> $fname 
    echo "Rollno: $rollno" >> $fname
    echo "Course: $course" >> $fname 
    echo "values inserted to file success fully ."
    echo ""
    cat $fname
else 
    echo "file doesnt exist."
fi 
