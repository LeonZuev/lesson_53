# lesson_53
Recurrence

## cw53 pack:
## Tic-tac-toe game
This lesson contanes three classes:
cw53.Main, cw53.TicTacToe and cw53.Point.

Main class: contains the main method that initializes the game of cw53.TicTacToe,
reads user input, and loops through the game until it is finished.

TicTacToe class: contains the logic for the game, including
checking if the game is over, making moves, and displaying the game board.

Point class: represents a point on the game board and provides
methods for parsing user input and validating coordinates.

## hw53 pack:
TargetPointQuadrant class: reads the coordinates of a point from user
and determinaze in wich  quadrant of the coordinate plane it is located,
or if it is on the X or Y axis, or if it is the origin [0, 0]. After determining
the quadrant of the point, user can check the position of the point relative to a circle.

TargetPointCircle class: responsible for determining the position of a point
relative to a circle centered at the origin [0, 0]. The user provides the coordinates
of the point and the radius of the circle. Based on this input, the program determines
whether the point is inside the circle, on the border, or outside the circle.
