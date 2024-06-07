.data
.asciiz
text: "Stay Safe, Stay Home, "
prompt: "Enter Your Name: "
name:
.text
#Print The Prompt
li $v0, 4
la $a0, prompt
syscall
#store the name in the memory (using lable name)
li $v0, 8
la $a0, name
li $a1, 30
syscall

li $t0, 10 #Number of Iterations
start: blez $t0, stop # if $t0 <= 0 go to Stop! else run the cell

#print the "Stay Home Stay Safe"
li $v0, 4
la $a0, text
syscall
#Then print the name
la $a0, name
syscall
sub $t0, $t0, 1 #$t0 = $t0 - 1
j start # Jump to the beggining of the loop
#Exit
stop: li $v0, 10
syscall
