import unittest
import third_task

class TestFunctionTestGetAmountLikes(unittest.TestCase):
	def test_that_function_get_amount_likes_exist(self):	
		third_task.get_amount_likes([])
	def test_that_likes_takes_incorret_value(self):
		self.assertRaises(TypeError,third_task.get_amount_likes,"Name")
	def test_that_likes_takes_incorret_value(self):
		self.assertRaises(TypeError,third_task.get_amount_likes,1)
	def test_that_get_likes_return_correct_information(self):
		result = third_task.get_amount_likes([])
		self.assertEqual(result,'No One Like This')
	def test_that_get_likes_return_correct_information_pass_one_value(self):
		name = ['AbdulBasit']
		result = third_task.get_amount_likes(name)
		self.assertEqual(result, str(name[0]) + " Like This ")

	def test_that_get_likes_return_correct_information_pass_two_value(self):
		name = ['AbdulBasit','Adette']
		result = third_task.get_amount_likes(name)
		self.assertEqual(result, str(name[0]) + ' and ' + str(name[1]) + ' Likes This')