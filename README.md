# HPDIC MOD
* Installation
    * `sudo apt install maven -y`
* Compilation    
    * `bash compile.sh`, or manually do the following
    * `javac -d build main/java/edu/uw/ckks/*.java`
    * `javac -d build -cp build test/java/edu/uw/ckks/*.java`
* Run
    * `bash run.sh`, or manually do the following
    * `java -cp build test.java.edu.uw.ckks.TestComplex`

# Java-CKKS
Relevant papers:

- [Cheon, Jung Hee, et al. "Homomorphic encryption for arithmetic of approximate numbers."](https://eprint.iacr.org/2016/421.pdf)
- [Cheon, Jung Hee, et al. "A full RNS variant of approximate homomorphic encryption."](https://eprint.iacr.org/2018/931.pdf)

Nice posts:
- [CKKS explained series](https://blog.openmined.org/ckks-explained-part-1-simple-encoding-and-decoding/)

Other (actually secure) open-source implementations:
- [Microsoft SEAL](https://github.com/microsoft/SEAL)
- [Lattigo](https://github.com/tuneinsight/lattigo)
- [OpenFHE](https://github.com/openfheorg/openfhe-development)
