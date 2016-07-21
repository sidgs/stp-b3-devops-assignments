#!/bin/sh


# verify that program is providing 3 arguments
# if one is empty exist
# display help message with usage of the script


#src location must exist
src_location=$1

#target must exist if not create
target_location=$2

mail_message=""
mail_to=$3
if [ -d "log" ];then
log_file="log/$(date +%m%d%Y_%H%M).log"
elif [ ! -d "log" ];then
mkdir log
log_file="log/$(date +%m%d%Y_%H%M).log"
fi
main() {
for f in `ls "$src_location" | grep \.do$`
do
        #echo "Creating file `$f` "
        #echo  $f
        vAppendMask=`(date +%Y%m%d%H%M)`
        fileName="$f-$vAppendMask.done"
        #echo "Copying file to $target_location/$fileName"
        #set file_name = $f+
        cp "$src_location/$f" "$target_location/$fileName"
        mail_message="$mail_message moved file to  $target_location/$fileName \n"
#echo $f-$(date +%d%m%Y%H%M)
done
echo $mail_message
echo $mail_message >$log_file
if [ ! -z "$3" ];then
echo $mail_message | mail -e -s "status" $mail_to
fi
}

if [ -d "$src_location" ];then
        if [ -d $target_location ];then
#cd "$target_location"
        touch $log_file
        main
        elif [ ! -d $target_location ];then
        echo "Making directory $target_location"
        touch $log_file
        mkdir $target_location
        main
        fi
else
echo "Source location not found "
echo "Source location not found " >$log_file
if [ ! -z "$3"];then
echo "Cannot Process!! \n Source location not found " | mail -s "status" $mail_to
fi
fi

