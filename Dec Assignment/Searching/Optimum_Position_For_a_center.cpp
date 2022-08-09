#include <bits/stdc++.h>
#define Lim 0.999999
using namespace std;
const double eps = 1e-8; 
const double delta = 0.98;
const double T = 100; 
const double INF = 999999999;
const int N = 105;
struct Point{
    double x,y;
}p[N];
int n;
int dir[][2] = {{-1,0},{1,0},{0,1},{0,-1}};
double dis(Point a,Point b)
{
    return sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
}
double getSum(Point p[],Point s){
    double ans = 0;
    for(int i=0;i<n;i++){
        ans += dis(p[i],s);
    }
    return ans;
}
double Search(Point p[]){
    Point s = p[0]; 
    double res = INF;
    double t = T;
    while(t>eps){
        bool flag = true;
        while(flag){
            flag = false;
            for(int i=0;i<4;i++){
                Point next;
                next.x = s.x+dir[i][0]*t;
                next.y = s.y+dir[i][1]*t;
                double ans = getSum(p,next);
                if(ans<res){
                    res = ans;
                    s = next;
                    flag = true;
                }
            }
        }
        t = t*delta;
    }
    return res;
}
int main(){
    while(scanf("%d",&n)!=EOF){
        for(int i=0;i<n;i++){
            scanf("%lf%lf",&p[i].x,&p[i].y);
        }
        printf("%.5lf\n",Search(p));
    }
}