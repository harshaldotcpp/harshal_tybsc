#include <iostream>
#include <vector>
using namespace std;


const int WIDTH = 20;
const int HEIGHT = 20;

class ball{
    public:
    int x;
    int y;

    ball(int x,int y){
        this->x = x;
        this->y = y;
    }

    void draw(vector<vector<char>> screen){
        screen[this->y][this->x];
    }

    void update(){
    }
    

};

int main(){
    vector<char> row(WIDTH,' ');
   vector<vector<char>> screen(HEIGHT,row); 

    return 0;
}
