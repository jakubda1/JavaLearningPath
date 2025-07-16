# Pyramid Rotation Application

## Description
The Pyramid Rotation Application is a simple interactive console program that displays a pyramid pattern made of '8' characters and allows users to rotate it in different directions.

## Features
- Creates a pyramid of customizable size
- Rotates the pyramid in four directions (up, down, left, right)
- Simple keyboard controls for interaction

## How to Run
1. Compile and run the Java application
2. Follow the on-screen prompts

## Usage

### Initial Setup
When you start the application, you'll be prompted to enter a size for the pyramid:
```
How big pyramid do you want?
```

Enter a positive integer to determine the pyramid's size.

### Controls
After the pyramid is displayed, you can rotate it using the following keyboard controls:

- `w` - Rotate up
- `s` - Rotate down
- `a` - Rotate left
- `d` - Rotate right
- `q` - Quit the application

### Rotation Examples

#### Initial Pyramid
```
 8                            
 8  8                         
 8  8  8                      
 8  8  8  8                   
 8  8  8  8  8                
 8  8  8  8                   
 8  8  8                      
 8  8                         
 8
```


#### Rotated Left (a)
```
                            8 
                         8  8 
                      8  8  8 
                   8  8  8  8 
                8  8  8  8  8 
                   8  8  8  8 
                      8  8  8 
                         8  8 
                            8
```


#### Rotated Down (s)
```
    8  8  8  8  8  8  8  8  8 
       8  8  8  8  8  8  8    
          8  8  8  8  8       
             8  8  8          
                8
```


#### Rotated Up (w)
```
             8                
          8  8  8             
       8  8  8  8  8          
    8  8  8  8  8  8  8       
 8  8  8  8  8  8  8  8  8
```


## Exiting the Application
To exit the application, press `q` at the rotation prompt.

## Requirements
- Java Runtime Environment

Enjoy rotating your pyramid!