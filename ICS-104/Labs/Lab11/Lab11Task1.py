from math import sqrt


class Point:
    def __init__(self,x,y):
        self.x = x
        self.y = y
        self.d = 0
    def translate(self,dx,dy):
        self.x = self.x + dx
        self.y = self.y + dy
    
    def distanceTo(self , point2):
        distance =sqrt(((self.x- point2.x)**2) + (self.y-point2.y)**2)
        return distance

    def getX(self):
        return self.x
    
    def getY(self):
        return self.y
    
point1 = Point(3,5)
point2 = Point(-10,30)
point1.translate(5.5,-12.5)


print("new coordinates of point1= " + "("+ str(point1.x) +","+ str(point1.y) + ")\n") # i make it a string to make the spaces better 
print("Coordinates of point 2 = " + "(" + str(point2.x) + "," + str(point2.y),")\n")
print("Distance between the 2 points =", round(point1.distanceTo(point2),2))

