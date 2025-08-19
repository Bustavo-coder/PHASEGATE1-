import unittest
import second_task

class FunctionTestGetAvergae(unittest.TestCase):
	def test_that_getGrade_Exist(self):
		second_task.get_grade([2,3])
	def test_that_getGrade_takes_inccorect_value(self):
		self.assertRaises(TypeError,second_task.get_grade,"Nmae")
	def test_that_no_element_of_the_scores_list_is_a_String(self):
		result = ["Name","2000","Ade"]
		self.assertRaises(TypeError,second_task.get_grade,result)

	def test_that_get_grade_returns_correct_result(self):
		result = second_task.get_grade([90,70,80,80])
		self.assertEqual(result , 'B')
	def test_that_get_grade_returns_correct_result_second(self):
		result = second_task.get_grade([5,10,30,15])
		self.assertEqual(result , 'E')

	def test_that_get_grade_returns_correct_result_third(self):
		result = second_task.get_grade([50,60,70,60])
		self.assertEqual(result , 'D')


	
