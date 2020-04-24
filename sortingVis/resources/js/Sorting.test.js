

describe('Bubble Sort Test', () => {
    const Sorting = require('./Sorting');
    const data = [2,4,7,1,3,0,8,9,6,5];
    const showArray = jest.fn();
    const checkPause = jest.fn();

    const expected = [0,1,2,3,4,5,6,7,8,9];

    it('Function should call Draw(), Wait(), and be sorted after returning.', async () => {
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

    it('Function should call Draw(), Wait(), and be sorted after returning.', async () => {
        await Sorting.insertion_sort(data, showArray, checkPause);

        expect(showArray).toBeCalled();
        expect(checkPause).toBeCalled();

        expect(data).toEqual(expected);
    });
});

describe('Selection Sort Test', () => {
    const Sorting = require('./Sorting');
    const data = [2,4,7,1,3,0,8,9,6,5];
    const showArray = jest.fn();
    const checkPause = jest.fn();

    const expected = [0,1,2,3,4,5,6,7,8,9];

    it('Function should call Draw(), Wait(), and be sorted after returning.', async () => {
        await Sorting.selection_sort(data, showArray, checkPause);

        expect(showArray).toBeCalled();
        expect(checkPause).toBeCalled();

        expect(data).toEqual(expected);
    });
});

describe('Partition Test', () => {
    const Sorting = require('./Sorting');
    const data = [3,2,5,7,4,1,0,9,8,6];
    const showArray = jest.fn();
    const checkPause = jest.fn();
    const expectedArr = [3,2,5,4,1,0,6,9,8,7];
    const expectedPiv = 6;

    it('Function should select a pivot element and partition the array such that all elements greater than the pivot element are to the right of the pivot, and all those equal to or less than the pivot element are left of the pivot.', async () => {
        const pivot = await Sorting.partition(data, 0, 9, showArray, checkPause);

        expect(showArray).toBeCalled();
        expect(checkPause).toBeCalled();

        expect(data).toEqual(expectedArr);
        expect(pivot).toEqual(expectedPiv);
    });
});

describe('Quick Sort Test', () => {
    const Sorting = require('./Sorting');
    const data = [2,4,7,1,3,0,8,9,6,5];
    const showArray = jest.fn();
    const checkPause = jest.fn();

    const expected = [0,1,2,3,4,5,6,7,8,9];

    it('Function should call Draw(), Wait(), and be sorted after returning.', async () => {
        async function quick_sort(arr, left, right) {
            if(left < right)
            {
                let pivot = await Sorting.partition(arr, left, right, showArray, checkPause);

                await quick_sort(arr, left, pivot - 1);
                await quick_sort(arr, pivot + 1, right)
            }

            return arr;
        }

        await quick_sort(data, 0, 9);

        expect(showArray).toBeCalled();
        expect(checkPause).toBeCalled();
        expect(data).toEqual(expected);
    });
});

describe('Heap Sort Test', () => {
    const Sorting = require('./Sorting');
    const data = [2,4,7,1,3,0,8,9,6,5];
    const showArray = jest.fn();
    const checkPause = jest.fn();

    const expected = [0,1,2,3,4,5,6,7,8,9];

    it('Function should call Draw(), Wait(), and be sorted after returning.', async () => {
        await Sorting.heap_sort(data, showArray, checkPause);

        expect(showArray).toBeCalled();
        expect(checkPause).toBeCalled();

        expect(data).toEqual(expected);
    });
});

describe('Merge Sort Test', () => {
    const Sorting = require('./Sorting');
    const data = [2,4,7,1,3,0,8,9,6,5];
    const showArray = jest.fn();
    const checkPause = jest.fn();

    const expected = [0,1,2,3,4,5,6,7,8,9];

    it('Function should call Draw(), Wait(), and be sorted after returning.', async () => {
        await Sorting.merge_sort(data, showArray, checkPause);

        expect(showArray).toBeCalled();
        expect(checkPause).toBeCalled();

        expect(data).toEqual(expected);
    });
});

