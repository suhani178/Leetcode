/**
 * @param {Array} arr
 * @return {Generator}
 */
var inorderTraversal = function(arr) {

    function* traverse(array) {

        for (const item of array) {

            if (Array.isArray(item)) {
                yield* traverse(item);
            } else {
                yield item;
            }
        }
    }

    return traverse(arr);
};