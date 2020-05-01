describe("MyAlgorithmTests", function() {

    const Sorts = require("./Sorting.js");
    describe("Bubble Sort", function() {
        it("should be defined",function() {
            expect(Sorts.bubble_sort.toBeDefined);
        });
        it("should call showArray()",function() {
            expect(Sorts.showArray.toHaveBeenCalled);
        });
        it("should call checkPause()",function() {
            expect(Sorts.checkPause.toHaveBeenCalled);
        });
    });
    describe("Selection Sort", function() {
        it("should be defined",function() {
            expect(Sorts.selection_sort.toBeDefined);
        });
        it("should call showArray()",function() {
            expect(Sorts.showArray.toHaveBeenCalled);
        });
        it("should call checkPause()",function() {
            expect(Sorts.checkPause.toHaveBeenCalled);
        });
    });
    describe("Insertion Sort", function() {
        it("should be defined",function() {
            expect(Sorts.insertion_sort.toBeDefined);
        });
        it("should call showArray()",function() {
            expect(Sorts.showArray.toHaveBeenCalled);
        });
        it("should call checkPause()",function() {
            expect(Sorts.checkPause.toHaveBeenCalled);
        });
    });
    describe("Quick Sort", function() {
        it("should be defined",function() {
            expect(Sorts.quick_sort.toBeDefined);
        });
        it("should call partition()",function() {
            expect(Sorts.partition.toHaveBeenCalled);
        });

        describe("Partition", function() {
            it("should be defined",function() {
                expect(Sorts.partition.toBeDefined);
            });
            it("should call showArray()",function() {
                expect(Sorts.showArray.toHaveBeenCalled);
            });
            it("should call checkPause()",function() {
                expect(Sorts.checkPause.toHaveBeenCalled);
            });
        });
    });
    describe("Heap Sort", function() {
        it("should be defined",function() {
            expect(Sorts.heap_sort.toBeDefined);
        });
        it("should call heapify()",function() {
            expect(Sorts.heapify.toHaveBeenCalled);
        });
        it("should call showArray()",function() {
            expect(Sorts.showArray.toHaveBeenCalled);
        });
        it("should call checkPause()",function() {
            expect(Sorts.checkPause.toHaveBeenCalled);
        });

        describe("Heapify", function() {
            it("should be defined",function() {
                expect(Sorts.heapify.toBeDefined);
            });
            it("should call showArray()",function() {
                expect(Sorts.showArray.toHaveBeenCalled);
            });
            it("should call checkPause()",function() {
                expect(Sorts.checkPause.toHaveBeenCalled);
            });
        });
    });
    describe("Merge Sort", function() {
        it("should be defined",function() {
            expect(Sorts.merge_sort.toBeDefined);
        });
        it("should call showArray()",function() {
            expect(Sorts.showArray.toHaveBeenCalled);
        });
        it("should call checkPause()",function() {
            expect(Sorts.checkPause.toHaveBeenCalled);
        });
    });
});