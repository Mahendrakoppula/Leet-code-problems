class Solution {
    public int passThePillow(int n, int time) {
        // int currPos = 1;
        // int direction = 1;
        // for (int i = 1; i <= time; i++) {
        //     currPos += direction;
        //     if (currPos == 1 || currPos == n) {
        //         direction = -direction;
        //     }
        // }
        // return currPos;
    //     int index = time % (2*n - 2);
    // if (index < n) {
    //     return index + 1;
    // } else {
    //     return 2*n - index - 1;
    // }
//         int currPos = 1;
//     boolean directionRight = true; // true for right, false for left

//     while (time > 0) {
//         if (directionRight) {
//             // move to the right
//             currPos++;
//             if (currPos > n) {
//                 currPos = n - 1;
//                 directionRight = false;
//             }
//         } else {
//             // move to the left
//             currPos--;
//             if (currPos < 1) {
//                 currPos = 2;
//                 directionRight = true;
//             }
//         }
//         time--;
//     }

//     return currPos;
//     }
        
        int currPos = 1;
    boolean isForward = true;
    while (time > 0) {
        if (isForward) {
            if (currPos < n) {
                currPos++;
            } else {
                currPos--;
                isForward = false;
            }
        } else {
            if (currPos > 1) {
                currPos--;
            } else {
                currPos++;
                isForward = true;
            }
        }
        time--;
    }
    return currPos;
}
}