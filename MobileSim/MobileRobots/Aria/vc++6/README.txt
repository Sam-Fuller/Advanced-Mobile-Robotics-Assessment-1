We have put the old project and workspace files into this directory
but do not support these project files..  For more details see
INSTALL.txt.

To use these you'll need to:
1) move AriaDLL.dsp into the src directory
2) directory and Aria.dsp and Aria.dsw into the base directory 
3) move demo.dsp into the examples directory
4) move ArNetworkingLib.dsp into ArNetworking/src directory
5) move serverDemo.dsp into the ArNetworking/examples directory
6) open Aria.dsw and rebuild everything

You'll probably then want to move the dsp for the example you want
into the examples directory along with examples.dsw.

If you have problems building you'll probably need to add any new
files to the AriaDLL.dsp or ArNetworkingLib.dsp (typically it won't
compile because it can't find a class, and then you'll need to insert
that class's .cpp file into the project file).
