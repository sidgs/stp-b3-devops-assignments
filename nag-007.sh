#!/bin/sh


# verify that program is providing 3 arguments 
# if one is empty exist 
# display help message with usage of the script 
 

#src location must exist
source_directory=$1

#target must exist if not create 
final_target=$2

mail_message=""
mail_to=$3
if [ -d "log" ];then
log_file="log/$(date +%m%d%Y_%H%M).log"
elif [ ! -d "log" ];then
mkdir log
log_file="log/$(date +%m%d%Y_%H%M).log"
fi
main(){
for f in `ls "$source_directory" | grep \.do$`
do
#	echo "Creating file `$f` " 
 #	echo  $f
	vAppendMask=`(date +%Y%m%d%H%M)`
	fileName="$f-$vAppendMask.done"
	#echo "Copying file to $final_target/$fileName"
	#set file_name = $f+
	mv "$source_directory/$f" "$final_target/$fileName"
	mail_message="$mail_message moved file to  $final_target/$fileName \n"
#echo $f-$(date +%d%m%Y%H%M)
done
echo $mail_message
echo $mail_message >$log_file
if [ ! -z "$3" ];then 
echo $mail_message | mail -e -s "status" $mail_to
fi
}

if [ -d "$source_directory" ];then
	if [ -d $final_target ];then
	#cd "$final_target"
	touch $log_file
	main
	elif [ ! -d $final_target ];then
	echo "Making directory $final_target"
	touch $log_file
	mkdir $final_target
	main
	fi
else
echo "Source location not found "
echo "Source location not found " >$log_file
if [ ! -z "$3"];then
echo "Cannot Process!! \n Source location not found " | mail -s "status" $mail_to
fi
fi
