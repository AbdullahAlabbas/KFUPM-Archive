    .data
prompt:    .asciiz "Enter a, b, then c : "


result:     .asciiz "The Discriminant = "
.text
    # Prompt the user to enter the coefficients
    li $v0, 4
    la $a0, prompt
    syscall
    #Read a
    li $v0, 5
    syscall
    move $a0, $v0

    #Read b
    li $v0, 5
    syscall
    move $a1, $v0

    #Read c
    li $v0, 5
    syscall
    move $a2, $v0

    jal disc
    move $t0, $v0

    # Print the value of the Discriminant
    li $v0, 4
    la $a0, result
    syscall
    
    li $v0, 1
    move $a0, $t0
    syscall
    
    li $v0, 10
  
    syscall


disc:
     mulu $t0, $a1,$a1  # $t0 now has b^2
     mulu $t1, $a0,$a2  # $t1 now has a*c
     sll  $t1, $t1, 2   # $t2 now has 4ac
     sub  $v0, $t0, $t1
     jr $ra
     