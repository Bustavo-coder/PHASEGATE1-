import unittest
import first_task

class TestFucnctiongetAgeOFFatherTwiceSonsAge(unittest.TestCase):
	def test_function_get_diffrencee_exist(self):
		first_task.get_age_diffrence(1,2)
	def test_function_get_age_diffrence_takes_in_incorrect_fathers_age_value(self):
		self.assertRaises(TypeError, first_task.get_age_diffrence , "Ade",1)
	def test_function_get_age_diffrence_takes_in_incorrect_sons_age_value(self):
		self.assertRaises(TypeError, first_task.get_age_diffrence , 2,"rim")
	def test_test_function_get_age_diffrence_takes_in_fathers_age_less_than_1(self):
		self.assertRaises(ValueError, first_task.get_age_diffrence, 0,2)
	def test_test_function_get_age_diffrence_takes_in_sons_age_less_than_1(self):
		self.assertRaises(ValueError, first_task.get_age_diffrence, 2,0)
	def test_test_function_get_age_diffrence_returns_correct_result_if_fathers_age_is_already_twice_the_sons_age(self):
		result = first_task.get_age_diffrence(50,10)
		self.assertEqual(result , 30)
	def test_test_function_get_age_diffrence_returns_correct_result_if_fathers_age_is_equals_twice_the_sons_age(self):
		result = first_task.get_age_diffrence(30,15)
		self.assertEqual(result , 0)
	def test_test_function_get_age_diffrence_returns_correct_result_if_fathers_age_is_not_yet_twice_the_sons_age(self):
		result = first_task.get_age_diffrence(40,25)
		self.assertEqual(result , 10)