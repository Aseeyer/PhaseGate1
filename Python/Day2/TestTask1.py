import unittest
import Task1

class TestForAgeGapCalculator(unittest.TestCase):
    def test_that_age_gap_calculator_function_exists(self):
        Task1.age_gap_calculator(50, 20)

    def test_that_age_gap_calculator_returns_correct_value_in_past(self):
        result = Task1.age_gap_calculator(50, 20)
        self.assertEqual(result, 10)

    def test_that_age_gap_calculator_returns_correct_value_in_future(self):
        result = Task1.age_gap_calculator(30, 20)
        self.assertEqual(result, 10)

    def test_that_age_gap_calculator_returns_zero_when_exact(self):
        result = Task1.age_gap_calculator(40, 20)
        self.assertEqual(result, 0)
