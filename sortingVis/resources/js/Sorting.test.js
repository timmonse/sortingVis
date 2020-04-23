describe('Bubble Sort Test', () => {
    const Sorting = require('./Sorting');
    const data = [2,4,7,1,3,0,8,9,6,5];
    const showArray = jest.fn();
    const checkPause = jest.fn();

    const expected = [0,1,2,3,4,5,6,7,8,9];

    it('Function should call Draw() function, call Wait() function, and be sorted after returning.', async () => {
        await Sorting.bubble_sort(data, showArray, checkPause);

        expect(showArray).toBeCalled();
        expect(checkPause).toBeCalled();

        expect(data).toEqual(expected);
    });
});

describe('Inserstion Sort Test', () => {
    const Sorting = require('./Sorting');
    const data = [2,4,7,1,3,0,8,9,6,5];
    const showArray = jest.fn();
    const checkPause = jest.fn();

    const expected = [0,1,2,3,4,5,6,7,8,9];

    it('Function should call Draw() function, call Wait() function, and be sorted after returning.', async () => {
        await Sorting.insertion_sort(data, showArray, checkPause);

        expect(showArray).toBeCalled();
        expect(checkPause).toBeCalled();

        expect(data).toEqual(expected);
    });
});