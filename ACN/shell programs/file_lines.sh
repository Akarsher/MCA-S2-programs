#enter a file name and check if the file exist or not ,if it exist display the lines between 4 & 8 in the file.

read -p "enter a file name: " fname;

if [ -f $fname ] 
then
    awk 'NR>4 && NR <8' $fname
else
    echo "file doesnt exist ."
fi
