#enter a file name and check if the file exist or not ,if it exist display the lines between 4 & 8 in the file and columns 2 & 3.

read -p "enter a file name: " fname;

if [ -f $fname ] 
then
    echo "rows between 4 & 8"
    awk 'NR>4 && NR <8' $fname
    echo ""
    echo "columns between 2&3"
    awk '{print $1,$3}' $fname
else
    echo "file doesnt exist ."
fi
