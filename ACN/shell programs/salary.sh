#Write a shell program to Calculate the gross salary of the employee where his DA is 40%   of basic salary and HRA is 20% of basic salary. Get basic salary as user input.
#(Hint: Gross Salary = Basic salary + DA + HRA)


echo "*****Employee_Salary_Calculator*****";
hr=0;
da=0;
gross=0;

read -p "Enter Employees ID: " id;
read -p "Enter Employees Name: " name;
read -p "Enter Employees Salary: " slr;

da=$((2 * slr / 5));
hra=$((slr / 5));
gross=$((slr + hra + da));

echo "Employee Details :"
echo "Employees ID: $id"
echo "Employees Name: $name"
echo "Total Salary : $gross"
