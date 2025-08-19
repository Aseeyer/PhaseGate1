def get_average(number_one, number_two, number_three):
    average = (number_one + number_two + number_three) // 3

    if 90 <= average <= 100:
        return 'A'
    elif 80 <= average < 90:
        return 'B'
    elif 70 <= average < 80:
        return 'C'
    elif 60 <= average < 70:
        return 'D'
    elif 0 <= average < 60:
        return 'F'
    else:
        raise ValueError(f"Average out of range: {average}")

number_one = 50
number_two = 60
number_three = 80

grade = get_average(number_one, number_two, number_three)
print("Grade:", grade)
