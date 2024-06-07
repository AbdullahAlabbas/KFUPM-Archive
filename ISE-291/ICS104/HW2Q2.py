def is_valid_password(password):
    # Check if the password is at least 8 characters long
    if len(password) < 8:
        return False

    has_uppercase = False
    has_lowercase = False
    has_digit = False

    for char in password:
        # Check for uppercase letter
        if char.isupper():
            has_uppercase = True
        # Check for lowercase letter
        if char.islower():
            has_lowercase = True
        # Check for digit
        if char.isdigit():
            has_digit = True

    # Check if all conditions are met
    if not (has_uppercase and has_lowercase and has_digit):
        return False

    return True


def main():
    while True:
        password = input("Enter your password: ")
        confirm_password = input("Confirm your password: ")

        if password != confirm_password:
            print("Does not fulfill the rules.")
        elif not is_valid_password(password):
            print("Does not fulfill the rules.")
        else:
            print("The password is valid.")
            break


if __name__ == "__main__":
    main()
