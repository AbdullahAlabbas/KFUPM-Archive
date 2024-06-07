.data 
str: .asciiz "Enter number of seconds :"
days: .asciiz " Days\n"
hours: .asciiz " Hours\n"
min: .asciiz " Minutes\n"
sec: .asciiz " Seconds\n"
.text
li $v0 4
la $a0 str
syscall 
li $v0 5
syscall
move $t0 $v0
li $t9 86400 	# 86400 is secondes per day(24*60*60)
div $t0 $t9  
mfhi $t0   	#The remaining seconds in $t0
li $v0 1
mflo $a0	 # $a0 has the days
syscall
li $v0 4	# print days
la $a0 days
syscall 

li $t9 3600  		 # 30000 is secondes per hour(60*60)
div $t0 $t9
mfhi $t0       		#The remaining seconds in $t0
li $v0 1
mflo $a0 		# $a0 has the hours
syscall
li $v0 4
la $a0 hours
syscall 

li $t9 60		# calculating and printing the minutes
div $t0 $t9
mfhi $t0   		# $t0 will have the remaining  seconds
li $v0 1
mflo $a0		 # print minutes
syscall
li $v0 4
la $a0 min
syscall 
li $v0 1
move $a0 $t0 		# print seconds
syscall
li $v0 4
la $a0 sec
syscall
#terminate the code
li $v0,10
syscall
