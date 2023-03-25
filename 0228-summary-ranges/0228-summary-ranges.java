class Solution {
  public List<String> summaryRanges(int[] nums) {
    // List<String> result = new ArrayList<>();
    // if (nums == null || nums.length == 0) {
    //     return result;
    // }
    // int start = nums[0];
    // int end = nums[0];
    // for (int i = 1; i < nums.length; i++) {
    //     if (nums[i] == end + 1) {
    //         end = nums[i];
    //     } else {
    //         if (start == end) {
    //             result.add(Integer.toString(start));
    //         } else {
    //             result.add(start + "->" + end);
    //         }
    //         start = nums[i];
    //         end = nums[i];
    //     }
    // }
    // if (start == end) {
    //     result.add(Integer.toString(start));
    // } else {
    //     result.add(start + "->" + end);
    // }
    // return result;

    //  List<String> result = new ArrayList<>();
    //     if (nums.length < 1) {
    //         return result;
    //     }
    //     int start = nums[0];
    //     int end = nums[0];
    //     boolean isRange = false;
    //     for (int i = 1; i < nums.length; i++) {
    //         if (nums[i] == end + 1) {
    //             end = nums[i];
    //             isRange = true;
    //         } else {
    //             if (isRange) {
    //                 result.add(start + "->" + end);
    //                 isRange = false;
    //             } else {
    //                 result.add(Integer.toString(start));
    //             }
    //             start = nums[i];
    //             end = nums[i];
    //         }
    //     }
    //     if (isRange) {
    //         result.add(start + "->" + end);
    //     } else {
    //         result.add(Integer.toString(start));
    //     }
    //     return result;

       // List<String> list = new ArrayList<>();
       //  if (nums.length == 0) return list;
       //  int start = nums[0], end = nums[0];
       //  StringBuilder sb = new StringBuilder();
       //  for (int i = 0; i < nums.length - 1; i++) {
       //      if (nums[i] + 1 != nums[i + 1]) {
       //          if (start == end) {
       //              sb.append(start);
       //              list.add(sb.toString());
       //          } else {
       //              sb.append(start).append("->").append(end);
       //              list.add(sb.toString());
       //          }
       //          sb.setLength(0);
       //          start = nums[i + 1];
       //          end = nums[i + 1];
       //      } else {
       //          end = nums[i + 1];
       //      }
       //  }
       //  if (start == end) {
       //      sb.append(start);
       //      list.add(sb.toString());
       //  } else {
       //      sb.append(start).append("->").append(end);
       //      list.add(sb.toString());
       //  }
       //  return list;
      
      
      List<String> result = new ArrayList<>();
if (nums.length < 1) {
    return result;
}

int start = nums[0];
int end = nums[0];
boolean isRange = false;
StringBuilder sb = new StringBuilder();

for (int i = 1; i < nums.length; i++) {
    if (nums[i] == end + 1) {
        end = nums[i];
        isRange = true;
    } else {
        if (isRange) {
            sb.append(start).append("->").append(end);
            result.add(sb.toString());
            sb.setLength(0);
            isRange = false;
        } else {
            sb.append(start);
            result.add(sb.toString());
            sb.setLength(0);
        }
        start = nums[i];
        end = nums[i];
    }
}

if (isRange) {
    sb.append(start).append("->").append(end);
    result.add(sb.toString());
} else {
    sb.append(start);
    result.add(sb.toString());
}

return result;

}


}