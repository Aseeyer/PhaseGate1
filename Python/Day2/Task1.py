"""Your function takes two arguments: current father's age(years), current age of the his son(years). calculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old). The answer is always greater or equal to 0, no matter if it was in the past or it is in the future."""


def age_gap_calculator(father_age, son_age):
    return abs(2 * son_age - father_age)



father_age = 50
son_age = 20

twice = age_gap_calculator(father_age, son_age)
print(f"The father was or will be, twice as old at {twice} years.")