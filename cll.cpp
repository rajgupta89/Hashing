#include <stdio.h>
#include<string.h>

int difference(char *input1)
{
    int maxpalindromelength=1;
    int l,h,i;
    int len=strlen(input1);
    for(i=1;i<len;i++){
        l=i-1;
        h=i;
        while(l>=0 && h<len && input1[l]==input1[h]){
            if(h-l+1 >maxpalindromelength){
                maxpalindromelength=h-l+1;
            }
            --l;
            ++h;
        }
        l=i-1;
        h=i+1;
        while(l>=0 && h<len && input1[l]==input1[h]){
            if(h-l+1>maxpalindromelength){
                maxpalindromelength=h-l+1;
            }
            --l;
            ++h;
        }
    }
    return maxpalindromelength-1;
}
int main()
{
    char s[100];
    scanf("%s",s);
    printf("%d",difference(s));
    return 0;
}