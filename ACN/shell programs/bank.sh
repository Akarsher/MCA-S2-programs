
read -p "enter your name : " name
read -p "enter account number : " acno
read -p "enter balance :" bal

while true
do 
    echo -e "\nMenu\n1.deposite\n2.withdrwal\n3.view details\n4.exit"
    read -p "enter your choice :" ch
    case $ch in 
        1)
        read -p "enter the amount to deposite : " dep 
        if [[ $dep -gt 0 ]] then        
        bal=$((bal + dep))
        echo "deposite successfull."
        else
        echo "invalid amount"
        fi
        ;;
        
        2)
        read -p "enter the amount withdraw : " wd 
        if [[ $wd -le $bal ]]
        then
        bal=$((bal - wd))
        echo "wthdrawal was success."
        else
        echo "insufficient balance."
        fi 
        ;;
        
        3)
        echo "Account Details: "
        echo "Name : $name"
        echo "Account number : $acno"
        echo "Balance : $bal"
        ;;
        
        4)
        echo "exiting ..."
        break
        ;;
        
        *)
        echo "invalid choice."
        break
        ;;
        
    esac 
done
    
