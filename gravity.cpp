#include <iostream>
#include <vector>
using namespace std;


const int WIDTH = 20;
const int HEIGHT = 20;

class Ball{
    public:
    int x;
    int y;

    Ball(int x,int y){
        this->x = x;
        this->y = y;
    }

    void draw(vector<vector<char>> &screen){
        screen[this->y][this->x] = '*'; 

    }
    void display(vector<vector<char>> screen){
        for(auto row : screen){
                for(auto pixel : row){
                    cout<<pixel<<" ";
                }
                cout<<endl;
        }
    }
    void update(){
    }
    

};

int main(){
    vector<char> row(WIDTH,' ');
   vector<vector<char>> screen(HEIGHT,row); 
        Ball b = Ball(WIDTH/2,HEIGHT/2);
        b.draw(screen);
        b.display(screen);
       
       

    return 0;
}
