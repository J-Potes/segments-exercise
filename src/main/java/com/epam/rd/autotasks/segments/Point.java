package com.epam.rd.autotasks.segments;

class Point {
    private double x;
    private double y;

    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public boolean equalTo(Point p2) {
    	if(this.x == p2.getX() && this.y == p2.getY()) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}
