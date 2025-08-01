import pytest
import math

def test_sqrt():
   num = 25
   assert math.sqrt(num) == 5

def testsquare():
   num = 7
   assert num*num == 40  #this will fail which is expectd where 7*7 is 49, not 40

def tesequality():
   assert 10 == 11


 