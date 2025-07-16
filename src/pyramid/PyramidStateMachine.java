package pyramid;

abstract class PyramidStateMachine {
    abstract void faceLeft(Pyramid pyramid);

    abstract void faceRight(Pyramid pyramid);

    abstract void faceUp(Pyramid pyramid);

    abstract void faceDown(Pyramid pyramid);
}

class FacingLeftState extends PyramidStateMachine {
    @Override
    void faceLeft(Pyramid pyramid) {
    }

    @Override
    void faceRight(Pyramid pyramid) {
        pyramid.pyramidArray = Rotator.rotate180(pyramid.pyramidArray);
        pyramid.state = new FacingRightState();
    }

    @Override
    void faceDown(Pyramid pyramid) {
        pyramid.pyramidArray = Rotator.rotateCounterClockwise(pyramid.pyramidArray);
        pyramid.state = new FacingDownState();
    }

    @Override
    void faceUp(Pyramid pyramid) {
        pyramid.pyramidArray = Rotator.rotateClockwise(pyramid.pyramidArray);
        pyramid.state = new FacingUpState();
    }

}


class FacingRightState extends PyramidStateMachine {
    @Override
    void faceLeft(Pyramid pyramid) {
        pyramid.pyramidArray = Rotator.rotate180(pyramid.pyramidArray);
        pyramid.state = new FacingLeftState();
    }

    @Override
    void faceRight(Pyramid pyramid) {
    }

    @Override
    void faceDown(Pyramid pyramid) {
        pyramid.pyramidArray = Rotator.rotateClockwise(pyramid.pyramidArray);
        pyramid.state = new FacingDownState();
    }

    @Override
    void faceUp(Pyramid pyramid) {
        pyramid.pyramidArray = Rotator.rotateCounterClockwise(pyramid.pyramidArray);
        pyramid.state = new FacingUpState();
    }

}


class FacingUpState extends PyramidStateMachine {
    @Override
    void faceLeft(Pyramid pyramid) {
        pyramid.pyramidArray = Rotator.rotateCounterClockwise(pyramid.pyramidArray);
        pyramid.state = new FacingLeftState();
    }

    @Override
    void faceRight(Pyramid pyramid) {
        pyramid.pyramidArray = Rotator.rotateClockwise(pyramid.pyramidArray);
        pyramid.state = new FacingRightState();
    }

    @Override
    void faceDown(Pyramid pyramid) {
        pyramid.pyramidArray = Rotator.rotate180(pyramid.pyramidArray);
        pyramid.state = new FacingDownState();
    }

    @Override
    void faceUp(Pyramid pyramid) {
    }
}


class FacingDownState extends PyramidStateMachine {
    @Override
    void faceLeft(Pyramid pyramid) {
        pyramid.pyramidArray = Rotator.rotateClockwise(pyramid.pyramidArray);
        pyramid.state = new FacingLeftState();
    }

    @Override
    void faceRight(Pyramid pyramid) {
        pyramid.pyramidArray = Rotator.rotateCounterClockwise(pyramid.pyramidArray);
        pyramid.state = new FacingRightState();
    }

    @Override
    void faceDown(Pyramid pyramid) {
    }

    @Override
    void faceUp(Pyramid pyramid) {
        pyramid.pyramidArray = Rotator.rotate180(pyramid.pyramidArray);
        pyramid.state = new FacingUpState();
    }

}